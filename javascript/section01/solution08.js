/*
일곱난쟁이

왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하던 백설공주
일과를 마치고 온 난쟁이가 일곱명이 아니라 아홉명이었던 것
아홉명의 난쟁이는 모두 자신이 " 백설공주와 일곱난쟁이"의 주인공이라 주장
일곱난쟁이들의 키의 합이 100이 됨을 기억한 백설공주
아홉난쟁이들이 주어졌을 때, 백설공주를 도와 일곱난쟁이를 찾는 프로그램

input : 20 7 23 19 10 15 25 8 13
output : 20 7 23 19 10 8 13
*/

let nine = [20, 7, 23, 19, 10, 15, 25, 8, 13];
console.log(solution(nine));

function solution(arr) {
    // 얕은 복사 : 메모리 주소를 복사 -> 똑같은 배열을 가리킴
    let answer = arr;
    // reduce() : a에 b를 누적 계산 (a는 0으로 초기화)
    let sum = arr.reduce((a, b) => a+b, 0);
    
    for(let i = 0; i < 8; i++) {
        for(let j = i+1; j < 9; j++) {
            if((sum - (arr[i] + arr[j])) === 100) {
                arr.splice(i, 1);
                arr.splice(j-1, 1);
            }
        }
    }

    return answer;
}
