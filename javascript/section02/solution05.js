/*
등수 계산

국어점수를 의미하는 N개의 정수가 입력된다. 같은 점수가 입력될 경우 높은 등수로 동일처리한다.
즉 가장 높은 점수가 92점인데 그 점수가 3명이라면 1등은 3명이고 다음 학생의 등수는 4등이다.

input : 87, 89, 92, 100, 76
output : 4 3 2 1 5
*/

let score = [87, 89, 92, 100, 76];
console.log(`result1 : ${solution1(score)}`);
console.log(`result2 : ${solution2(score)}`);

function solution1(score) {
    let answer = [];

    for(let i = 0; i < score.length; i++) {
        // 1등부터 시작
        let n = 1;
        for(let j = 0; j < score.length; j++) {
            // i기준으로 i보다 큰 점수가 나타나면
            if(score[j] > score[i]) {
                n++;
            }
        }
        answer.push(n);
    }

    return answer;
}

function solution2(score) {
    let n = score.length;
    let answer = Array.from({length : n}, () => 1);

    for(let i = 0; i < score.length; i++) {
        for(let j = 0; j < score.length; j++) {
            if(score[j] > score[i]) answer[i]++;
        }
    }

    return answer;
}
