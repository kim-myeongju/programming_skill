/*
10부제

서울시는 6월 1일부터 교통 혼잡을 막기 위해서 자동차 10부제를 시행한다. 자동차 10부제는 자동자번호의 일의 자리 숫자와
날짜의 일의 자리 숫자가 일치하면 해당 자동차의 운행을 금지하는 것이다. 예를 들어 자동차번호의 일의 자리 숫자가 7이면
7일, 17일, 27일에 운행을 하지 못한다. 날짜의 일의 자리 숫자가 주어지고 7대의 자동차번호의 끝 두 자리 수가 주어졌을 때
위반하는 자동차의 대수를 출력하는 프로그램을 작성

input : 3
        25 23 11 47 53 17 33
output : 3
---
input : 0
        12 20 54 39 87 91 30
output : 3
*/

// let day = 3;
// let cars = [25, 23, 11, 47, 53, 17, 33];
let day = 0;
let cars = [12, 20, 54, 39, 87, 91, 30];
console.log(`result : ${solution(day, cars)}`)

function solution(day, nums) {
    let answer = 0;

    for(let num of nums) {
        if(num % 10 === day) {
            answer++;
        }
    }

    return answer;
}
