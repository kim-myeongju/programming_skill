/*
문자 찾기

한개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇개 존재하는지 알아내는 프로그램

input : COMPUTERPROGRAMMING
        R
output : 3
*/

console.log(`result : ${solution("COMPUTERPROGRAMMINGR", 'R')}`);

function solution(str, c) {
    let answer = 0;

    // 1.
    // for(let s of str) {
    //     if(s === c) answer++;
    // }

    // 2. split()는 c 문자를 기준으로 끊어서 배열로 반환
    answer = str.split(c).length - 1;

    return answer;
}
