package section01;

public class FindChar {

    public static void main(String[] args) {

        /*
        * 문자 찾기
        *
        * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇개 존재하는지 알아내는 프로그램
        * 대소문자 구분 X
        *
        * Computercooler
        * input : c
        * output : 2
        * */

        System.out.println("result : " + solution("Computercooler", 'c'));

    }

    public static int solution(String str, char c) {
        // charAt() | toCharArray()

        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c) {
//                answer++;
//            }
//        }

        for (char ch : str.toCharArray()) {
            if (ch == c) answer++;
        }

        return answer;
    }
}
