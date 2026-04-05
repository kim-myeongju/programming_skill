/*
25.3 가위바위보

가위 : 1
바위 : 2
보   : 3

    1 2 3 4 5
A   2 3 3 1 3
B   1 1 2 2 3
    A B A B D
*/

let n = 5;
let a = [2, 3, 3, 1, 3];
let b = [1, 1, 2, 2, 3];
console.log(`result : ${solution(n, a, b)}`);

function solution(n, a, b) {
    let answer = [];
    for(let i = 0; i < n; i++) {
        if(a[i] === b[i]) answer.push('D');
        // 'A기준'으로 A가 이기는 경우 3가지
        else if(a[i] === 1 && b[i] === 3) answer.push('A');
        else if(a[i] === 2 && b[i] === 1) answer.push('A');
        else if(a[i] === 3 && b[i] === 2) answer.push('A');
        else answer.push('B');
    }

    return answer;
}
