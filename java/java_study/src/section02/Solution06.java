package section02;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Solution06 {

    public static void main(String[] args) {
        /*
        * 뒤집은 소수
        *
        * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램.
        * 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력. 910을 뒤집으면 19로 첫자리부터 연속된 0은 무시한다.
        *
        * input : 32 55 62 20 250 370 200 30 100
        * output : 23 2 73 2 3
        * */

        int[] nums = {32, 55, 62, 20, 250, 370, 200, 30, 100};
        System.out.print("result : ");
        for (int num : solution(nums)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {

        // 소수 판별
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            
            // 숫자 뒤집기 사이클
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }
}
