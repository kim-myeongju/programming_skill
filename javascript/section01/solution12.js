/*
대문자로 통일

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자로 모두 통일하여 문자열을 출력

input : ItisTimeToStudy
output : ITISTIMETOSTUDY
*/

console.log(`result : ${solution("ItisTimeToStudy")}`);

function solution(str) {
    let answer = "";

    for(let s of str) {
        // 1. 전체 바꿔버림
        // answer += s.toUpperCase();

        // 2. 소문자 판별 후 변경
        // if(s === s.toLowerCase()) answer += s.toUpperCase();
        // else answer += s;

        // 3. 아스키코드 활용 (97 - 65 = 32) / fromCharCode() : 아스키코드를 문자로 변경
        let num = s.charCodeAt();
        if(num >= 97 && num <= 122) answer += String.fromCharCode(num-32);
        else answer += s;
    }

    return answer;
}
