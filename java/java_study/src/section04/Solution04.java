package section04;

import java.util.HashMap;

public class Solution04 {

    public static void main(String[] args) {
        /*
        * 모든 아나그램 찾기 (Hash, Two Pointer, Sliding Window)
        *
        * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램 작성
        * 아나그램 판별 시 대소문자 구분. 부분문자열은 연속된 문자열이어야 함.
        *
        * input : bacaAacba
        *         abc
        * output : 3
        * */

        System.out.println("result : " + solution("bacaAacba", "abc"));
    }

    public static int solution(String strA, String strB) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char b : strB.toCharArray()) bm.put(b, bm.getOrDefault(b, 0) + 1);

        int l = strB.length() - 1;
        for (int i = 0; i < l; i++) am.put(strA.charAt(i), am.getOrDefault(strA.charAt(i), 0) + 1);

        int lt = 0;
        for (int rt = l; rt < strA.length(); rt++) {
            am.put(strA.charAt(rt), am.getOrDefault(strA.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(strA.charAt(lt), am.get(strA.charAt(lt)) - 1);
            if (am.get(strA.charAt(lt)) == 0) am.remove(strA.charAt(lt));
            lt++;
        }

        return answer;
    }
}
