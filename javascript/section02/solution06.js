/*
격자판 최대합

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력합니다.

input : 10, 18, 10, 12, 15
        12, 30, 30, 23, 11
        11, 25, 50, 53, 15
        19, 27, 29, 37, 27
        19, 13, 30, 13, 19
output : 155
*/

let arr = [[10, 13, 10, 12, 15],
            [12, 39, 30, 23, 11],
            [11, 25, 50, 53, 15],
            [19, 27, 29, 37, 27],
            [19, 13, 30, 13, 19]];
console.log(`result : ${solution(arr)}`);

function solution(arr) {
    // 최대값을 저장하기 위해서 가장 작은 수로 초기화
    let answer = Number.MIN_SAFE_INTEGER;
    let n = arr.length;
    let sumx = sumy = 0;

    for(let i = 0; i < n; i++) {
        // 각 행의 합과 각 열의 합을 구해야함으로 이 지점에서 0으로 초기화
        sumx = sumy = 0;
        for(let j = 0; j < n; j++) {
            sumx += arr[i][j];  // 행의 합
            sumy += arr[j][i];  // 열의 합
        }
        answer = Math.max(answer, sumx, sumy);
    }

    // 각 대각선의 합을 구해야 함으로 한번더 0으로 초기화
    sumx = sumy = 0;
    for(let i = 0; i < n; i++) {
        sumx += arr[i][i];
        sumy += arr[i][n-i-1];
    }
    answer = Math.max(answer, sumx, sumy);

    return answer;
}
