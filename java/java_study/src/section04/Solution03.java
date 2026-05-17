package section04;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution03 {

    public static void main(String[] args) {
        /*
        * 매출액의 종류
        *
        * 제과점을 운영하는 가족의 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하여라
        * 만약 N=7, 7일간의 매출기록이 아래와 같고, 이때 K=4이면
        * 1. [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
        * 2. [12, 20, 10, 23]는 매출액의 종류가 4이다.
        * 3. [20, 10, 23, 17]는 매출액의 종류가 4이다.
        * 4. [10, 23, 17, 10]는 매출액의 종류가 3이다.
        * N일 간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종류를 출력하는 프로그램 작성
        *
        * input : 7, 4
        *         20, 12, 20, 10, 23, 17, 10
        * output: 3 4 4 3
        * */

        int[] nums = {20, 12, 20, 10, 23, 17, 10};
        System.out.print("result : ");
        for (int num : solution(7, 4, nums)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> solution(int n, int k, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        // k - 1 만큼 미리 세팅
        for (int i = 0; i < k - 1; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hm.put(nums[rt], hm.getOrDefault(nums[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(nums[lt], hm.get(nums[lt]) - 1);
            if (hm.get(nums[lt]) == 0) hm.remove(nums[lt]);
            lt++;
        }

        return answer;
    }
}
