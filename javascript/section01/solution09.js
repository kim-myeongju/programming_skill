/*
A -> #

대문자로 이루어진 영어단어가 입력되면 단어에 포함된 'A'를 모두 '#'으로 바꾸어 출력하는 프로그램

input : BANANA
output : B#N#N#
*/

console.log(`result : ${solution("BANANA")}`);

function solution(str) {
    let answer = "";

    // 1.
    // for(let s of str) {
    //     if(s === 'A') answer += '#';
    //     else answer += s;
    // }

    // 2. 문자열은 얕은 복사 불가
    answer = str.replace(/A/g, '#');

    return answer;
}
