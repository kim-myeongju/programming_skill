/*
중복문자제거

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하여 출력하는 프로그램

input : ksekkset
output : kset
*/

console.log(`result : ${solution("ksekkset")}`);

function solution(str) {
    let answer = "";

    //indexOf()
    for(let i = 0; i < str.length; i++) {
        // console.log(str[i], i, str.indexOf(str[i]));

        if(i === str.indexOf(str[i])) {
            answer += str[i];
        }
    }

    return answer;
}
