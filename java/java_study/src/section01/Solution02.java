package section01;

public class Solution02 {

    /*
    * 대소문자 변환
    *
    * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램
    *
    * input : StuDY
    * output : sTUdy
    * */

    public static void main(String[] args) {
        System.out.println("result : " + solution("StuDY"));
    }

    public static String solution(String str) {
        String answer = "";

        // isUpperCase() | toUpperCase()
//        for (char c : str.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                answer += Character.toLowerCase(c);
//            } else {
//                answer += Character.toUpperCase(c);
//            }
//        }

        // ASCII
        // 대문자 : 65 ~ 90
        // 소문자 : 97 ~ 122
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                answer += (char) (c + 32);
            } else {
                answer += (char) (c - 32);
            }
        }

        return answer;
    }

}
