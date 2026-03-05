package section01;

public class Solution05 {

    public static void main(String[] args) {
        /*
        * 특정 문자 뒤집기
        *
        * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램
        *
        * input : a#b!GE*T@S
        * output : S#T!EG*b@a
        * */

        System.out.println("result : " + solution("a#b!GE*T@S"));

    }

    public static String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;

        // Character.isAlphabetic() : 알파벳이면 true, 아니면 false
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
}
