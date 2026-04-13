package section02;

public class Solution11 {

    public static void main(String[] args) {
        /*
        * 임시반장 정하기
        *
        * 반학생 중에서 1~5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시반장으로 선정하는 프로그램
        *
        * input :  학년-> 1  2  3  4  5
        *         1번학생 2, 3, 1, 7, 3
        *         2번학생 4, 1, 9, 6, 8
        *         3번학생 5, 5, 2, 4, 4
        *         4번학생 6, 5, 2, 6, 7
        *         5번학생 8, 4, 2, 2, 2
        * output : 4 (번학생)
        * */

        int[][] student = {{2, 3, 1, 7, 3},
                            {4, 1, 9, 6, 8},
                            {5, 5, 2, 4, 4},
                            {6, 5, 2, 6, 7},
                            {8, 4, 2, 2, 2}};
        System.out.println(solution(student) + "번학생이 임시반장입니다.");
    }

    public static int solution(int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        int n = arr.length;

        // i : 학생 번호
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // k : 학년
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                // 학생의 번호가 1부터 시작되기 때문에 0부터 시작한 i에 1을 더해줌
                answer = i + 1;
            }
        }

        return answer;
    }
}
