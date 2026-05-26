/*
K번째 큰 수

1부터 100사이의 자연수가 적힌 N장의 카드가 있다. 같은 숫자의 카드가 여러장 있을 수 있다.
이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 한다. 3장을 뽑을 수 있는 모든 경우를 기록한다.
기록한 값 중 K번째로 큰 수를 출력하는 프로그램 작성
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19 이고 K값이 3이라면 K번째 큰 값은 22
* 중복을 제거하는 자료구조 Set 활용 (순서 보장 X)

input: 13, 15, 34, 23, 45, 65, 33, 11, 26, 42
output: 143
*/

let k = 3;
let cards = [13, 15, 34, 23, 45, 65, 33, 11, 26, 42];
console.log(`result : ${solution(k, cards)}`);

function solution(k, cards) {
    let answer = 0;
    let n = cards.length;
    let tmp = new Set();

    // 3가지 숫자를 더하는 작업
    for(let i = 0; i < n; i++) {
        for(let j = i+1; j < n; j++) {
            for(let l = j+1; l < n; l++) {
                tmp.add(cards[i] + cards[j] + cards[l]);
            }
        }
    }

    // 배열화 한 후 내림차순 정렬
    // let arr = Array.from(tmp).sort((a, b) => a - b);        // 오름차순
    let arr = Array.from(tmp).sort((a, b) => b - a);        // 내림차순
    
    answer = arr[k-1];

    return answer;
}
