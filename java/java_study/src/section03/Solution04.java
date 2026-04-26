package section03;

public class Solution04 {

    public static void main(String[] args) {
        /*
        * 연속 부분 수열
        *
        * N개의 수로 이루어진 수열이 주어진다.
        * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램 작성
        * 만약 N=8, M=6이고 수열이 다음과 같다면
        * 1 2 1 3 1 1 1 2
        * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지
        *
        * 이중 for문 :O(n2)
        * two pointers : O(n)
        *
        * input : 8 6
        *         1, 2, 1, 3, 1, 1, 1, 2
        * output : 3
        * */

        int[] nums = {1, 2, 1, 3, 1, 1, 1, 2};
        System.out.println("result : " + solution(6, nums));
    }

    public static int solution(int m, int[] nums) {
        int answer = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < nums.length; rt++) {
            sum += nums[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= nums[lt++];
                if (sum == m) answer++;
            }
        }

        return answer;
    }
}
