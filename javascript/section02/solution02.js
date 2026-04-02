/*
25.2 보이는 학생

선생님이 N명의 학생을 일렬로 세웠다. 일렬로 서있는 학생의 키가 앞에서부터 순서대로 주어지면
맨 앞에 서있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램 작성

input : 130, 135, 148, 140, 145, 150, 150, 153
output : 5
*/

let students = [130, 135, 148, 140, 145, 150, 150, 153];
console.log(`result : ${solution(students)}`);

function solution(students) {
    // 첫번째 학생은 무조건 보이므로 1 카운트 하고 시작
    let answer = 1;
    let max = students[0];

    for(let i = 1; i < students.length; i++) {
        if(students[i] > max) {
            answer++;
            max = students[i];
        }
    }

    return answer;
}
