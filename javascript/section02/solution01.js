/*
큰 수 출력하기

N개의 정수를 입력받아, 자신의 바로 앞의 수보다 큰 수만 출력하는 프로그램

input : 7 3 9 5 6 12
output : 7 9 6 12
*/

let nums = [7, 3, 9, 5, 6, 12];
console.log(`result : ${solution(nums)}`);

function solution(nums) {
    let answer = [];
    answer.push(nums[0]);

    for(let i = 1; i < nums.length; i++) {
        if(nums[i] > nums[i-1]) {
            answer.push(nums[i]);
        }
    }

    return answer;
}
