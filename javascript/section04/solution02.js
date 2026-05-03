/*
뒤집은 소수

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램
예를 들어, 32를 뒤집으면 23인데 이 숫자는 소수이다. 910을 뒤집으면 19가 되고 이 숫자는 소수이다.

input : 32, 55, 62, 20, 250, 370, 200, 30, 100
output : 23, 2, 73, 2, 3
 */

let nums = [32, 55, 62, 20, 250, 370, 200, 30, 100];
console.log(`result01 : ${solution01(nums)}`);
console.log(`result02 : ${solution02(nums)}`);

// 소수판별함수
function isPrime(num) {
    if(num === 1) return false;
    
    // 소수판별법 : 0, 1, 자기자신 제외한 나머지 숫자로 나누어 떨어지는 수가 있으면 소수가 아님
    // 절반 또는 제곱근까지만 검사가능
    for(let i = 2; i <= parseInt(Math.sqrt(num)); i++) {
        if(num % i === 0) return false;
    }

    return true;
}

function solution01(nums) {
    let answer = [];

    for(let num of nums) {
        let res = 0;

        // num 이 0이 되면 break
        while(num) {
            let tmp = num % 10;
            res = res * 10 + tmp;
            num = parseInt(num / 10);
        }
        
        if(isPrime(res)) answer.push(res);
    }

    return answer;
}

function solution02(nums) {
    let answer = [];

    for(let num of nums) {
        // 내장함수 사용해서 숫자 뒤집기
        let res = Number(num.toString().split('').reverse().join(''));
        if(isPrime(res)) answer.push(res);
    }

    return answer;
}
