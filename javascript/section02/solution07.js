/*
봉우리

각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역. 그 지역이 몇개인지 알아내는 프로그램

input : 5, 3, 7, 2, 3
        3, 7, 1, 6, 1
        7, 2, 5, 3, 4
        4, 3, 6, 4, 1
        8, 7, 3, 5, 2
output : 10
*/

let arr = [[5, 3, 7, 2, 3],
            [3, 7, 1, 6, 1],
            [7, 2, 5, 3, 4],
            [4, 3, 6, 4, 1],
            [8, 7, 3, 5, 2]];
console.log(`result : ${solution(arr)}`);

function solution(arr) {
    let answer = 0;
    let n = arr.length;
    let dx = [-1, 0, 1, 0];
    let dy = [0, 1, 0, -1];

    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            // 1은 참
            let flag = 1;
            for(let k = 0; k < 4; k++) {
                let nx = i + dx[k];
                let ny = j + dy[k];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n
                    && arr[nx][ny] >= arr[i][j]) {
                        // 0은 거짓
                    flag = 0;
                    break;                    
                }
            }

            if(flag) {
                answer++;
            }
        }
    }

    return answer;
}
