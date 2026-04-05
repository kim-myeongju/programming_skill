package section02;

public class Solution09 {

    public static void main(String[] args) {
        /*
        * 격자판 최대합
        *
        * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
        *
        * input : 10, 13, 10, 12, 15
        *         12, 39, 30, 23, 11
        *         11, 25, 50, 53, 15
        *         19, 27, 29, 37, 27
        *         19, 13, 30, 13, 19
        * output : 155
        * */

        int[][] arr = {{10, 13, 10, 12, 15},
                      {12, 39, 30, 23, 11},
                      {11, 25, 50, 53, 15},
                      {19, 27, 29, 37, 27},
                      {19, 13, 30, 13, 19}};
        System.out.println("result : " + solution(arr));
    }

    public static int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < arr.length; j++) {
                // 행 더하기
                sum1 += arr[i][j];
                // 열 더하기
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선의 합 구하기
        sum1 = sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            // 왼쪽에서 오른쪽 대각선의 합
            sum1 += arr[i][i];
            // 오른쪽에서 왼쪽 대각선의 합
            sum2 += arr[i][arr.length - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
