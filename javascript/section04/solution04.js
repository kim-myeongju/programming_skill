/*
졸업 선물

선생님은 오래 졸업하는 반 학생들에게 졸업선물을 주려고 한다.
학생들에게 인터넷 쇼핑몰에서 각자 원하는 상품을 골라 그 상품의 가격과 배송비를 제출하라고 하였다. 예산은 한정되어있다.
현재 예산으로 최대 몇 명의 학생에게 선물을 사줄 수 있는지 구하는 프로그램 작성
선생님은 상품 하나를 50% 할인해서 살 수 있는 쿠폰을 가지고 있다. 배송비는 할인에 포함 X, 상품가격은 항상 짝수

input : 5 28 (상품 5개, 예산 28원)
        6 6  (상품가격, 배송비)
        2 2
        4 3
        4 5
        10 3
output : 4
=> (2, 2), (4, 3), (4, 5) 구매 후  (10, 3)을 할인받아 (5, 3)에 사면 비용이 4+7+9+8=28
*/

let products = [[6, 6], [2, 2], [4, 3], [4, 5], [10, 3]];
console.log(`result : ${solution(28, products)}`);

function solution(m, products) {
    let answer = 0;
    let n = products.length;
    // 배송비 포함 가격이 낮은 순으로 정렬
    products.sort((a, b) => (a[0] + a[1]) - (b[0] + b[1]));
    // console.log(products);

    for(let i = 0; i < n; i++) {
        // 남은 예산 = 예산 - (상품가격/할인쿠폰50% + 배송비)
        let money = m - (products[i][0] / 2 + products[i][1]);
        let cnt = 1;
        for(let j = 0; j < n; j++) {
            // 구매 비용이 남은 예산보다 크다면 멈추기
            if(j !== i && (products[j][0] + products[j][1]) > money) break;

            // 같은 상품이 아니면서 상품구매비용이 남은 예산보다 작거나 같으면 구매하고 카운트
            if(j !== i && (products[j][0] + products[j][1]) <= money) {
                money -= (products[j][0] + products[j][1]);
                cnt++;
            }
        }
        answer = Math.max(answer, cnt);
    }

    return answer;
}
