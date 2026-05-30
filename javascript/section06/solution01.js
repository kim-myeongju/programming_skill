/*
올바른 괄호

괄호가 입력되었을 때, 올바른 괄호이면 YES, 올바르지 않으면 NO를 출력
(())(): YES, (()())): NO

자료구조 stack 활용 - LIFO
반대개념 : queue - FIFO

input : (()(()))(()
output : NO
*/

// console.log(`result : ${solution("(()(()))(()")}`);
console.log(`result : ${solution("()()(())")}`);

function solution(str) {
    let answer = "YES";
    let stack = [];

    for(let s of str) {
        if(s === '(') stack.push(s);
        else {
            if(stack.length === 0) answer = "NO";
            stack.pop();
        }
    }

    if(stack.length > 0) answer = "NO";

    return answer;
}
