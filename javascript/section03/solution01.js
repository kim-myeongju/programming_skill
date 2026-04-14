/*
회문 문자열

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문문자열이라고 한다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 'YES', 아니면 'NO'를 출력하는 프로그램 작성
대소문자 구분 하지 않음

input : gooG
output : YES
*/

console.log(`result: ${solution("gooG")}`);

function solution(str) {
    let answer = "YES";
    str = str.toLowerCase();
    let len = str.length;

    // 1. 순수코딩
    // for(let i = 0; i < Math.floor(len / 2); i++) {
    //     if(str[i] !== str[len - i - 1]) answer = "NO";
    // }

    // 2. 메서드 활용
    // split : 문자를 배열화, reverse : 문자배열을 거꾸로, join : 다시 문자열화 시킴
    if(str.split('').reverse().join('') !== str) answer = "NO";

    return answer;
}
