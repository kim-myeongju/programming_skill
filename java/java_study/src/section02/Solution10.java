package section02;

public class Solution10 {

    public static void main(String[] args) {
        /*
        * 봉우리
        *
        * 지도 정보 N*N의 격자판 주어지고 각 격자에는 그 지역의 높이가 쓰여있다.
        * 각 각자판 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역. 봉우리 지역이 몇개인지 알아내는 프로그램
        * 격자의 가장자리는 0으로 초기화
        *
        * input :
        *   0, 0, 0, 0, 0, 0, 0
        *   0, 5, 3, 7, 2, 3, 0
        *   0, 3, 7, 1, 6, 1, 0
        *   0, 7, 2, 5, 3, 4, 0
        *   0, 4, 3, 6, 4, 1, 0
        *   0, 8, 7, 3, 5, 2, 0
        *   0, 0, 0, 0, 0, 0, 0
        *
        * output : 10
        * */

        int[][] arr = {{5, 3, 7, 2, 3},
                        {3, 7, 1, 6, 1},
                        {7, 2, 5, 3, 4},
                        {4, 3, 6, 4, 1},
                        {8, 7, 3, 5, 2}};
        System.out.println("result : " + solution(arr));
    }

    public static int solution(int[][] arr) {
        int answer = 0;
        // 상하좌우 방향
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;

                for (int k = 0; k < n - 1; k++) {
                    int nx = i + dx[k]; // 행
                    int ny = j + dy[k]; // 열
                    
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) answer++;
            }
        }

        return answer;
    }
}
