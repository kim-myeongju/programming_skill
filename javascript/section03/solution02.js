/*
유효한 팰린드롬

앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 팰린드롬이라고 한다.
문자열이 입력되면 해당 문자열이 팰린드로이라면 "YES", 아니라면 "NO"를 출력하는 프로그램 작성
단 회문 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않음

input : found7, time: study; Yduts; emit, 7Dnuof
output : YES
*/

let str = "found7, time: study; Yduts; emit, 7Dnuof";
console.log(`result : ${solution(str)}`);

function solution(str) {
    let answer = "YES";

    // /[^a-z]/g 소문자가 아닌것들을 '' 제거
    str = str.toLowerCase().replace(/[^a-z]/g, '');
    // split('') 문자배열화해서, reverse() 뒤집은 다음, join() 다시 문자열로 이어서 검증
    if(str.split('').reverse().join('') !== str) answer = "NO";

    return answer;
}
