package section02;

import javax.naming.CannotProceedException;

public class Solution05 {

    public static void main(String[] args) {
        /*
        * 소수 (에라토스테네스 체)
        *
        * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램 작성
        * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개
        * 제한시간 1초
        *
        * input : 20
        * output : 8
        * */

        System.out.println("result : " + solution(20));
    }

    public static int solution(int num) {
        int answer = 0;
        int[] ch = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= num; j += i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}
