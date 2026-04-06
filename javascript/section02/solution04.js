/*
점수 계산

점수 : 1, 0, 1, 1, 1, 0, 0, 1, 1, 0
채점 : 1, 0, 1, 2, 3, 0, 0, 1, 2, 0
총점 : 10

input : 1, 0, 1, 1, 1, 0, 0, 1, 1, 0
output : 10
*/

let score = [1, 0, 1, 1, 1, 0, 0, 1, 1, 0];
console.log(`result : ${solution(score)}`);

function solution(score) {
    let answer = 0, cnt = 0;

    for(let i = 0; i < score.length; i++) {
        if(score[i] === 1) {
            cnt++;
            answer +=cnt;
        } else {
            cnt = 0;
        }
    }

    return answer;
}
