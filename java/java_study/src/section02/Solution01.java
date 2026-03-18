package section02;

import java.util.ArrayList;

public class Solution01 {

    public static void main(String[] args) {
        /*
        * 큰 수 출력하기
        *
        * N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램
        *
        * input : 7 3 9 5 6 12
        * output : 7 9 6 12
        * */

        int[] nums = {7, 3, 9, 5, 6, 12};
        ArrayList<Integer> result = solution(nums);
        System.out.print("result : ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                answer.add(nums[i]);
            }
        }

        return answer;
    }
}
