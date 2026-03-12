package section01;

public class Solution10 {

    public static void main(String[] args) {
        /*
        * 가장 짧은 문자거리
        * 
        * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램 작성
        *
        * input : teachermode
        *         e
        * output : 1 0 1 2 1 0 1 2 2 1 0
        * */

        String s = "teachermode";
        char t = 'e';
        int[] output = solution(s, t);
        for (int out : output) {
            System.out.print(out + " ");
        }
    }
    
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        // 순방향 1
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        
        // 역방향 2 : 문자 t의 위치와 가까운 거리를 구해야해서
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        
        return answer;
    }
}
