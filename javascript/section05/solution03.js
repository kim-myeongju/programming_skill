/*
크레인 인형뽑기

input
> 인형
[0, 0, 0, 0, 0]
[0, 0, 1, 0, 3]
[0, 2, 5, 0, 1]
[4, 2, 4, 4, 2]
[3, 5, 1, 3, 1]
> 뽑기
[1, 5, 3, 5, 1, 2, 1, 4]

output : 4
*/

let dolls = [[0, 0, 0, 0, 0],
            [0, 0, 1, 0, 3],
            [0, 2, 5, 0, 1],
            [4, 2, 4, 4, 2],
            [3, 5, 1, 3, 1]];
let arr = [1, 5, 3, 5, 1, 2, 1, 4];

console.log(`result : ${solution(dolls, arr)}`);

function solution(board, move) {
    let answer = 0;
    let stack = [];

    // i = 행, pos = 열 (-1 해줘야함 배열인덱스는 0부터 시작해서 열맞춰주려면)
    move.forEach(pos => {
        for(let i = 0; i < board.length; i++) {
            // 해당 칸에 인형이 있다면
            if(board[i][pos - 1] !== 0) {
                // 그 인형을 꺼내고 0으로 교체해서 비움 표시
                let tmp = board[i][pos - 1];
                board[i][pos - 1] = 0;

                if(stack[stack.length - 1] == tmp) {
                    // 만약 그 전에 막 꺼낸 인형과 같은 인형을 만나면 같은 인형 2개 다 스택에서 빼내고 카운트 2
                    stack.pop();
                    answer += 2;
                } else {
                    // 서로 다른 인형이면 스택에 쌓기
                    stack.push(tmp);
                }
                // 해당 작업 한번 완료 하면 for문 종료
                break;
            }
        }
    });

    return answer;
}
