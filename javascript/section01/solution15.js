/*
가운데 문자 출력

소문자로 된 단어(문자열)가 입력되면 그 단어의 가운데 문자를 출력하는 프로그램을 작성
단어의 길이가 짝수일 경우 가운데 2개의 문자를 출력

input : study
output : u

input : good
output : oo

 */

console.log(`result : ${solution("study")}`);
console.log(`result : ${solution("good")}`);
console.log(`result : ${solution("length")}`);

function solution(str) {
    let answer;
    // index : 0 1 '2' 3 4 -> 홀수일 경우 정확히 가운데를 가리키는 공식
    let mid = Math.floor(str.length / 2);

    // 1. substring()
    // if(str.length % 2 == 1) answer = str.substring(mid, mid + 1);
    // else answer = str.substring(mid - 1, mid + 1);

    // 2. substr()
    if(str.length % 2 == 1) answer = str.substr(mid, 1);
    else answer = str.substr(mid - 1, 2);

    return answer;
}
