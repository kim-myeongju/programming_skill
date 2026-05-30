/*
두 배열 합치기

오름차순으로 정렬된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
two pointers 알고리즘 활용

input : 1, 3, 5
        2, 3, 6, 7, 9
output : 1, 2, 3, 3, 5, 6, 7, 9
*/

console.log(`result : ${solution([1, 3, 5], [2, 3, 6, 7, 9])}`);

function solution(arr1, arr2) {
    let answer = [];
    let n = arr1.length;
    let m = arr2.length;
    let p1 = p2 = 0;
    // && 사용해야함. 둘중 하나가 거짓이 되면 종료되어야해서
    while(p1 < n && p2 < m) {
        if(arr1[p1] <= arr2[p2]) answer.push(arr1[p1++]);
        else answer.push(arr2[p2++]);
    }

    // 나머지 넣어주기!
    while(p1 < n) answer.push(arr1[p1++]);
    while(p2 < m) answer.push(arr2[p2++]);

    return answer;
}
