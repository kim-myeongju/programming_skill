/*
괄호문자제거

입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램
STACK 자료구조 사용

input : (A(BC)D)EF(G(H)(IJ)K)LM(N)
output : EFLM
*/

console.log(`result : ${solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)")}`);

function solution(str) {
    let answer = "";
    let stack = [];

    for(let s of str) {
        if(s == ')') {
            // ')' 를 만나면 '(' 를 찾아 pop 할 때까지 문자 제거
            while(stack.pop() !== '(');
        } else stack.push(s);       // 남은 문자 출력
    }

    answer = stack.join('');

    return answer;
}
