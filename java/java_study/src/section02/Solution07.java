package section02;

public class Solution07 {

    public static void main(String[] args) {
        /*
        * 점수계산
        *
        * input : 1 0 1 1 1 0 0 1 1 0
        * output: 10 (1 0 1 2 3 0 0 1 2 0)
        * */

        int[] score = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        System.out.print("result : " + solution(score));
    }

    public static int solution(int[] score) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }
}
