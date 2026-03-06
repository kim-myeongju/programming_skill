/*
최솟값 구하기 (min)

7개의 수가 주어지면 그 숫자 중 가장 작은 수를 출력하는 프로그램

input : 5 3 7 11 2 15 17
output : 2
*/
let nums = [5, 3, 7, 11, 2, 15, 17]
console.log(`result : ${solution(nums)}`);

function solution(arr) {
    let answer, min = Number.MAX_SAFE_INTEGER;
    
    // 최솟값 구하는 내장함수 이용 : 파라미터로 정수만 가능하고 배열은 전개연산자(...arr)사용해서 넘기기
    // let answer = Math.min(...arr);

    for(let i = 0;  i < arr.length; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
    }
    answer = min;

    return answer;
}
