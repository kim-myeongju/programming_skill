package section01;

public class Solution06 {

    public static void main(String[] args) {
        /*
        * 중복문자제거
        *
        * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램
        * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지
        *
        * input : ksekkset
        * output : kset
        * */

        System.out.println("result : " + solution("ksekkset"));

    }

    public static String solution(String str) {
        String answer = "";

        // indexOf(i) : 같은 문자가 여러개 있어도 가장 앞에 있는 문자의 인덱스번호를 리턴
        // 즉, 진행되고있는 i와 str.indexOf(str.charAt(i))가 같으면 처음 등장한 문자라는 뜻
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
