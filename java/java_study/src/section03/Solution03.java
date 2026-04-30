package section03;

public class Solution03 {

    public static void main(String[] args) {
        /*
         * 최대 매출
         *
         * 제과점 운영 중 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구한다면,
         * 만약 N=10 이고, 10일 간의 매출기록이 아래와 같다. 이때 K=3 이라면
         * 12, 15, 11, 20, 25, 10, 20, 19, 13, 15
         * 연속된 3일간의 최대 매출액은 11 + 20 + 25 = 56
         *
         * 슬라이딩 윈도우(sliding window algorithm)
         *  반복되는 구간 탐색을 O(N2) -> O(N) 로 줄여 효율을 높임
         *  k개 기준으로 맨앞의 값은 마이너스, 그 다음값은 플러스하면서 오른쪽으로 진행
         *
         * input : 10, 3
         *         12, 15, 11, 20, 25, 10, 20, 19, 13, 15
         * output : 56
         * */

        int n = 10;
        int k = 3;
        int[] nums = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        System.out.println("result : " + solution(n, k, nums));
    }

    public static int solution(int n, int k, int[] nums) {
        int answer;
        int sum = 0;

        for (int i = 0; i < k; i++) sum += nums[i];
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (nums[i] - nums[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
