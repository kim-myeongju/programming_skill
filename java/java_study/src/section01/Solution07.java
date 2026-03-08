package section01;

public class Solution07 {

    public static void main(String[] args) {
        /*
        * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
        * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 아니라면 "NO"를 출력하는 프로그램
        * 대소문자 구분 X
        *
        * input : gooG
        * output : YES
        * */

        System.out.println("result : " + solution("gooG"));
    }

    public static String solution(String str) {
        // 1.
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        // 2.
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }

        return "YES";
    }
}
