package section02;

import java.util.ArrayList;

public class Solution08 {

    public static void main(String[] args) {
        /*
        * 등수 구하기
        *
        * N명의 학생의 국어점수가 입력되면 각 학생의 둥수를 입력된 순서대로 출력하는 프로그램
        * 같은 점수가 입력될 경우 높은 등수로 동일 처리. 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
        *
        * input : 87, 89, 92, 100, 76
        * output : 4 3 2 1 5
        *
        * */

        int[] score = {87, 89, 92, 100, 76};
        System.out.print("result : ");
        for (int s : solution(score)) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> solution(int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            // 1등부터 시작
            int cnt = 1;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > score[i]) {
                    cnt++;
                }
            }
            answer.add(cnt);
        }

        return answer;
    }
}
