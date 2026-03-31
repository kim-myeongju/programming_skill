/*
중복문자제거

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하여 출력하는 프로그램

input : ksekkset
output : kset
*/

console.log(`result1 : ${solution1("ksekkset")}`);
console.log(`result2 : ${solution2("ksekkset")}`);

// 중복문자제거
function solution1(str) {
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

// 특정문자의 개수
function solution2(str) {
    let answer = 0;
    let pos = str.indexOf('k');
    
    while(pos !== -1) {
        answer++;
        pos = str.indexOf('k', pos + 1);
    }

    return answer;
}
