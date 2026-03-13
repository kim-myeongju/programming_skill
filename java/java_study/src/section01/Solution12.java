package section01;

public class Solution12 {

    public static void main(String[] args) {
        /*
        * 암호 풀기 문제
        * 
        * 알파벳 대문자로 구성괸 비밀편지, 알파벳 한문자마다 # 또는 *가 일곱개로 구성
        * #은 이진수 1, *은 이진수 0
        * 만약, #*****# -> 1000001를 십진수화하면 65
        * 아스키코드에서 65는 'A'
        *
        * input : 4
        *         #****###**#####**#####**##**
        * output : COOL
        * */

        System.out.println("result : " + solution(4, "#****###**#####**#####**##**"));
    }

    public static String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            // 1. 7자리씩 끊어서 해당 문자들을 이진수로 변환
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2. 이진수의 문자열을 십진수로 변환
            int num = Integer.parseInt(tmp, 2);
            // 3. 십진수의 숫자를 문자로 변환
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }
}
