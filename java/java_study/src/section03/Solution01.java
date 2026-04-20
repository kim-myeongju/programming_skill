package section03;

import java.util.ArrayList;

public class Solution01 {

    public static void main(String[] args) {
        /*
        * 28.1 두 배열 합치기 (two pointers 알고리즘)
        *
        * 오름차순으로 정렬된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
        * 시간복잡도 : O(n)
        *
        * input : [1, 3, 5]
        *         [2, 3, 6, 7, 9]
        * output : 1 2 3 3 5 6 7 9
        * */
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 3, 6, 7, 9};
        System.out.print("result : ");
        for (int num : solution(nums1, nums2)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> solution(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int n = nums1.length, m = nums2.length;

        while (p1 < n && p2 < m) {
            if (nums1[p1] < nums2[p2]) {
                answer.add(nums1[p1++]);
            } else {
                answer.add(nums2[p2++]);
            }
        }

        while (p1 < n) answer.add(nums1[p1++]);
        while (p2 < m) answer.add(nums2[p2++]);

        return answer;
    }
}
