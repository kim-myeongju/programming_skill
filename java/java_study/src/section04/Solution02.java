package section04;

import java.util.HashMap;

public class Solution02 {

    public static void main(String[] args) {
        /*
        * Anagram (Hash)
        * 
        * 아나그램이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다.
        * ex) AbaAeCe, baeeACA 는 알파벳을 나열한 순서는 다르지만 그 구성은 A(2), a(1), b(1), C(1), e(2)로
        * 알파벳과 그 개수가 모두 일치한다. 즉 어느 한 단어를 재배열하면 상대편 단어가 될 수 있는 것을 아나그램이라고 한다.
        * 길이가 같은 두개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램 작성. 대소문자 구분.
        *
        * input : AbaAeCe, baeeACA
        * output: YES
        *
        * input : abaCC, Caaab
        * output : NO
        * */

        System.out.println("result1 : " + solution("AbaAeCe", "baeeACA"));
        System.out.println("result2 : " + solution("abaCC", "Caaab"));
    }

    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char s : str1.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (char s : str2.toCharArray()) {
            // 해당 키가 없거나 해당 키의 값이 0이라면 NO (아나그램이 아님)
            if (!map.containsKey(s) || map.get(s) == 0) answer = "NO";
            else map.put(s, map.get(s) - 1);
        }

        return answer;
    }
}
