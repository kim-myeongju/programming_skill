package section03;

public class Solution06 {

    public static void main(String[] args) {
        /*
        * 최대 길이의 연속부분수열 (two pointers)
        * 
        * 0과 1로 구성된 길이가 N인 수열이 주어진다.
        * 이 수열에서 최대 k번을 0을 1로 변경할 수 있다. 최대 k번의 변경을 통해
        * 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램 작성
        * 만약 길이가 14인 다음과 같은 수열이 주어지고 k = 2라면
        * 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1
        * 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1
        * result : 8
        *
        * input : 14, 2
        *         1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1
        * output : 8
        * */

        int[] nums = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        System.out.println("result : " + solution(2, nums));
    }

    public static int solution(int k, int[] nums) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < nums.length; rt++) {
            if (nums[rt] == 0) cnt++;
            while (cnt > k) {
                if (nums[lt] == 0) cnt--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }
        
        return answer;
    }
}
