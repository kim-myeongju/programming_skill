package section03;

import java.util.*;

public class Solution02 {

    public static void main(String[] args) {
        /*
        * 29.2 공통원소 구하기
        *
        * A, B 두개의 집합이 주어지면 두 집합의 공통원소를 추출하여 오름차순으로 출력하는 프로그램
        * two pointers 알고리즘
        *
        * input : [1, 3, 9, 5, 2], [3, 2, 5, 7, 8]
        * output : [2, 3, 5]
        * */
        int[] nums1 = {1, 3, 9, 5, 2};
        int[] nums2 = {3, 2, 5, 7, 8};
        System.out.print("result : " + " ");
        for (int num : solution(nums1, nums2)) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    
    public static ArrayList<Integer> solution(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 먼저 각 배열을 오름차순으로 정렬
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;

        // p1 < nums1.length && p2 < nums2.length : 둘 중 하나가 거짓이 되면 반복문 끝 (한쪽 배열이 끝나면 종료)
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                answer.add(nums1[p1++]);
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }
}
