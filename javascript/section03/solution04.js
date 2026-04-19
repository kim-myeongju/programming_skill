/*
34.4 - 가장 짧은 문자거리

한개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램

input : teachermode e
output : 1 0 1 2 1 0 1 2 2 1 0
*/

let str = "teachermode";
let c = 'e';
console.log(`result : ${solution(str, c)}`);

function solution(str, c) {
    let answer = [];
    let p = 1000;

    for(let s of str) {
        if(s === c) p = 0;
        else p++;
        answer.push(p);
    }

    p = 1000;
    for(let i = str.length - 1; i >= 0; i--) {
        if(str[i] === c) p = 0;
        else p++;

        // if(answer[i] > p) answer[i] = p;
        answer[i] = Math.min(answer[i], p);
    }

    return answer;
}
