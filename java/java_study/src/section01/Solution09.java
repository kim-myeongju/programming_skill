package section01;

public class Solution09 {

    public static void main(String[] args) {
        /*
        * 숫자만 추출
        *
        * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수로 만듬
        * 만약 "tge0a1h205er"에서 숫자만 추출하면 0, 1, 2, 0, 5이고, 이것을 자연수로 만들면 1205
        *
        * input : g0en2T0s8eSoft
        * output : 208
        * */

        System.out.println("result : " + solution("g0en2T0s8eSoft"));
    }

    public static int solution(String str) {
        int answer = 0;

        // 1.
//        str = str.toLowerCase().replaceAll("[a-z]", "");
//        answer = Integer.parseInt(str);

        // 2. '0' ~ '9' : 48 ~ 57
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c >= 48 && c <= 57) {
                // 숫자 누적시키는 공식
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }
}
