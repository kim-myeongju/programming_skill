/*
중복단어제거

N개의 문자열이 입력되면 중복된 문자열은 제거하고 출력하는 프로그램 작성

input : good, time, good, time, study
output : good, time, study
*/

let str = ["good", "time", "good", "time", "study"];
console.log(`result: ${solution(str)}`);

function solution(str) {
    let answer;
    // filter() : 고차함수로서 콜백함수가 참을 리턴한 value만 필터링
    answer = str.filter((v, i) => {
        // console.log(v, i);
        // if(str.indexOf(v) === i) return true;
        return str.indexOf(v) === i;
    });

    return answer;
}
