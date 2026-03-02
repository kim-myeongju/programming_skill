package section01;

import java.util.ArrayList;

public class Solution04 {

    public static void main(String[] args) {

        /*
        * 단어 뒤집기
        *
        * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
        *
        * = input =
        * good
        * Time
        * Big
        *
        * = output =
        * doog
        * emiT
        * giB
        * */

        String[] str = {"good", "Time", "Big"};
        ArrayList<String> strArr = solution(str);

        for (String strResult : strArr) {
            System.out.println("result : " + strResult);
        }
    }

    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            // 1
            // StringBuilder : 새로운 객체가 생성되지 않고 해당 단어 객체를 그대로 이용하여 조작함
            // String 객체는 해당 문자열을 함수를 사용하여 조작하면 새로운 객체가 계속 만들어짐
            // StringBuilder.reverse() -> 문자열 전체를 뒤집음
//            String tmp = new StringBuilder(s).reverse().toString();
//            answer.add(tmp);

            // 2
            // swap
            char[] x = s.toCharArray();
            int lt = 0;
            int rt = x.length - 1;

            while (lt < rt) {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(x);
            answer.add(tmp);
        }

        return answer;
    }
}
