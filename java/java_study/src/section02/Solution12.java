package section02;

public class Solution12 {

    public static void main(String[] args) {

        /*
        * 맨토링 시스템
        *
        * 멘토링은 멘토와 멘디가 한짝이 되어 멘토가 멘티의 수학공부를 도와준다.
        * M번의 수학테스트를 통해 등수를 가지고 멘토와 멘티를 정한다.
        * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야한다.
        * M번의 수학점수가 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램
        * M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ,, N등 순으로 표현된다.
        *
        *  (4중 for문)
        * 멘토와 멘티가 될 수 있는 각각의 경우의 수는 약 4가지 (4 X 4) -> 2중 for문
        *
        * 
        * input : 4, 3
        *           (4명의 학생, 3번의 테스트)
        *         3, 4, 1, 2
        *         4, 3, 2, 1
        *         3, 1, 4, 2
        *           (3, 1) (3, 2) (4, 2) -> (멘토, 멘티)
        * output : 3
        * */

        int[][] students = {{3, 4, 1, 2}, {4, 3, 2, 1}, {3, 1, 4, 2}};
        System.out.println("result : " + solution(4, 3, students));
    }

    public static int solution(int n, int m, int[][] students) {
        int answer = 0;

        // i : 멘토 학생(기준학생), j : 멘티학생(비교하는 학생), K : 테스트 횟수(i, j의 등수 찾기)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                
                // i, j가 짝이 될 수 있는지 검증
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (students[k][s] == i) pi = s;
                        if (students[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

        return answer;
    }
}
