/*
세 수 중 최솟값

100 이하의 자연수 A, B, C를 입력받아 세 수 중 가장 작은 값을 출력하는 프로그램

input : 6 5 11
output : 5

*/

// compile command -> node solution01.js

function solution(a, b, c) {
    let answer;

    if(a < b) answer = a;
    else answer = b;

    if(c < answer) answer = c;

    return answer;
}

console.log(`result : ${solution(6, 5, 11)}`);
