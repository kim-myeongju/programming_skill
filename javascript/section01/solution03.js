/*
    연필 개수
    연필 1다스는 12자루. 학생 1인당 연필을 1자루씩 나누어 준다고 할 때 N명의 학생수를 입력하면 필요한 연필의 다스 수를
    계산하는 프로그램

    input : 25
    output : 3
    input : 178
    output : 15
*/

console.log(`result : ${solution(25)}`);
console.log(`result : ${solution(178)}`);

function solution(n) {
    const pencil = 12;
    let answer = Math.ceil(n / pencil);
    

    // 수학함수, Math -> ceil : 올림, floor : 내림, round : 반올림 ... etc

    return answer;
}
