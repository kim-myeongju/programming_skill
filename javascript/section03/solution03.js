/*
숫자만 추출

문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
isNaN() : 숫자가 아니면 true (NaN : Not A Number)

input : g0en2T0s8eSoft (0208)
output : 208
*/

console.log(`result : ${solution("g0en2T0s8eSoft")}`);

function solution(str) {
    // 1) paresInt 사용
    // let answer = "";

    // for(let s of str) {
    //     if(!isNaN(s)) answer += s;
    // }

    // return parseInt(answer);

    // 2) 수학적 계산
    let answer = 0;

    for(let s of str) {
        if(!isNaN(s)) answer = answer * 10 + Number(s);
    }

    return answer;
}
