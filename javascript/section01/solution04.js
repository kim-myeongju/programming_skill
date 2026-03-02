/*
1부터 N까지의 합 출력하기

자연수 N이 입력되면 1부터 N까지의 합을 출력하는 프로그램

input : 6
output : 21 (1+2+3+4+5+6)
*/

console.log(`result : ${solution(6)}`);

function solution(n) {
    let answer = 0;
    for(let i = 1; i <= n; i++) {
        answer += i;
    }

    return answer;
}
