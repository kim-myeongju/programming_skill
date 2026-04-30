/*
자릿수의 합

N개의 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고, 그 합이 최대인 자연수를 출력하는 프로그램 작성.
자릿수의 합이 같은 경우 원래 숫자가 큰 숫자를 답으로 함.
만약 235와 1234가 동시에 답이 될 수 있다면 1234를 답으로 출력

input : 128, 460, 603, 40, 521, 137, 123
output : 137
*/

let nums = [128, 460, 603, 40, 521, 137, 123];
console.log(`result : ${solution(nums)}`);

function solution(nums) {
    let answer = 0, max = Number.MIN_SAFE_INTEGER;

    for(let num of nums) {
        let sum = 0, tmp = num; // 나중에 원본숫자(num)를 출력해야해서 임시변수(tmp)에 저장해서 활용

        // tmp가 0이 되면 break
        while(tmp) {
            sum += tmp % 10;
            tmp = Math.floor(tmp / 10);
        }

        // 원본숫자의 합 비교 변수 : sum, max
        // 원본숫자 비교 변수 : answer, num
        if(sum > max) {
            max = sum;
            answer = num;
        } else if(sum === max) {
            // 새로운값이랑 최대값이랑 같다면 원본숫자의 크기를 비교해서 큰 숫자를 저장
            if(num > answer) answer = num;
        }
    }

    return answer;
}
