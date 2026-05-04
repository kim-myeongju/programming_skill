package section04;

import java.util.HashMap;

public class Solution01 {

    public static void main(String[] args) {
        /*
        * 학급 회장 (Hash)
        *
        * 학급 회장을 뽑는데 후보로 기호 A,B,C,D,E 가 등록했다.
        * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호가 쓰여져있고 선생님은 그 기호를 발표하고 있다.
        * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성
        * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정 (중복 등수 없음)
        *
        * input : 15
        *         BACBACCACCBDEDE
        * output : C
        * */

        System.out.println("학생회장은 '" + solution(15, "BACBACCACCBDEDE") + "'학생입니다.");
    }

    public static char solution(int n, String students) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char student : students.toCharArray()) {
            // getOrDefault(student, 0) + 1 : student key에 저장된 value(디폴트는 0)에 +1을 한 값을 저장
            map.put(student, map.getOrDefault(student, 0) + 1);
        }

        // Hashmap 출력하는 다양한 방법
//        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }
//        for (int value : map.values()) {
//            System.out.println(value);
//        }
//        System.out.println(map.containsKey('Z'));   // 해당 key 값이 있는지 판별 (T or F)
//        System.out.println(map.size());             // key 의 개수 (중복 X)
//        System.out.println(map.remove('A'));    // 특정 key 를 삭제하고 삭제한 key 의 value 값 빈환

        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
