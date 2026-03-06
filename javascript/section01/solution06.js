/*
홀수

7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최소값을 찾는 프로그램

12, 77, 38, 41, 53, 92, 85
=> 77 + 41 + 53 + 85 = 256
=> 41 < 53 < 77 < 85

input : 12 77 38 41 53 92 85
output : 256
         41
*/

let arr = [12, 77, 38, 41, 53, 92, 85];
console.log(`result : ${solution(arr)}`);

function solution(nums) {
    let answer = [];
    let sum = 0;
    let min = Number.MAX_SAFE_INTEGER;

    for(let num of nums) {
        if(num % 2 !== 0) {
            sum += num;
            if(num < min) {
                min = num;
            }
        }
    }

    answer.push(sum);
    answer.push(min);

    return answer;
}
