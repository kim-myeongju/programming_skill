package section04;

import java.util.Collections;
import java.util.TreeSet;

public class Solution05 {

    public static void main(String[] args) {
        /*
        * K번째 큰 수
        * 
        * 1~100사이의 자연수 N장의 카드
        * 같은 숫자의 카드가 여러장 있을 수 있음
        * 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려하고 한다.
        * 3장을 뽑을 수 있는 모든 경우의 수를 기록한다.
        * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램
        * 
        * 자료구조 Set: 중복제거
        * TreeSet : 중복제거 + 정렬
        *
        * input: K = 3
        *        13, 15, 34, 23, 45, 65, 33, 11, 26, 42
        * output: 143
        * */

        int k = 3;
        int[] cards = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};
        System.out.println("result : " + solution(k, cards));
    }

    public static int solution(int k, int[] cards) {
        int answer = 0;
        // 내림차순 정렬 선언
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        // 오른차순 정렬
//        TreeSet<Integer> tSet = new TreeSet<>();

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int l = j + 1; l < cards.length; l++) {
                    tSet.add(cards[i] + cards[j] + cards[l]);
                }
            }
        }

//        tSet.remove(143);                       // 해당 값을 삭제
//        System.out.println(tSet.size());            // 원소의 개수
//        System.out.println("first : " + tSet.first());           // 오름차순 - 최소값, 내림차순 - 최대값
//        System.out.println("last : " + tSet.last());

        int cnt = 0;
        for (int num : tSet) {
            cnt++;
            if (cnt == k) answer = num;
        }

        return answer;
    }
}
