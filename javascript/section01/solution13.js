/*
대소문자 변환

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램

input : StuDY
output : sTUdy
*/

console.log(`result : ${solution("StuDY")}`);

function solution(str) {
    let answer = "";

    for(let s of str) {
        // 1.
        if(s === s.toUpperCase()) answer += s.toLowerCase();
        else answer += s.toUpperCase();

        // 2.
        // let num = s.charCodeAt();
        // if(num >= 65 && num <= 90) answer += String.fromCharCode(num + 32);
        // else answer += String.fromCharCode(num - 32);
    }

    return answer;
}
