/*
대문자 찾기

한 개의 문자열을 입력받아 해당 문자열에 알파벳 대문자가 몇개 있는지 알아내는 프로그램

input : KoreaTimeGood
output : 3
*/

console.log(`result : ${solution("KoreaTimeGood")}`);

function solution(str) {
    let answer = 0;

    for(let s of str) {
        // 1. toUpperCase()사용
        if(s === s.toUpperCase()) answer++;

        // 2. 아스키코드 사용 (대문자 : 65~90, 소문자 : 97~122)
        // let num = s.charCodeAt();
        // if(num >= 65 && num <= 90) answer++;
    }

    return answer;
}
