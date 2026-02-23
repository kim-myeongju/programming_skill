/*
삼각형 판별하기

길이가 서로 다른 A, B, C 세 개의 막대 길이가 주어지면 이 세 막대로 삼각형을
만들 수 있으면 "YES" 출력
만들 수 없으면 "NO" 출력

input : 6 7 11
output : YES

input : 13 33 17
output : NO

*/

function solution(a, b, c) {
    // 삼각형이 되기 위한 조건 : 가장 긴 막대가 나머지 두 막대의 길이를 합친 길이보다 길어야 함.

    let answer = "YES", max;
    let sum = a + b + c;

    if(a > b) max = a;
    else max = b;
    if(c > max) max = c;

    if((sum - max) <= max) answer = "NO";

    return answer;
}

console.log(`result : ${solution(6, 7, 11)}`);
console.log(`result : ${solution(13, 33, 17)}`);
