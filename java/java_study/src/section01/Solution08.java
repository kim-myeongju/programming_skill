package section01;

public class Solution08 {

    public static void main(String[] args) {
        /*
        * 유효한 Palindrome (팰린드롬)
        *
        * 앞에서 읽으나 뒤에서 읽으나 같은 문자열을 Palindrome (회문문자열)
        * Palindrome 이면 YES, 아니면 NO 출력
        * 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않음
        *
        * input : found7, time: study; Yduts; emit, 7Dnuof
        * output : YES
        * */

        System.out.println("result : " + solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }

    public static String solution(String str) {
        // ^A-Z : A ~ Z 까지의 알파벳이 아니면 "" 빈문자화
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }
}
