package section02;

public class Solution03 {

    public static void main(String[] args) {
        /*
        * 가위바위보
        *
        * A,B 두사람이 가위바위보를 한다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력한다.
        * 비길 경우에는 D를 출력한다.
        * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정한다.
        *
        * 횟수    : 1 2 3 4 5
        *   A     : 2 3 3 1 3
        *   B     : 1 1 2 2 3
        * 승자    : A B A B D
        * */

        int[] a = {2, 3, 3, 1, 3};
        int[] b = {1, 1, 2, 2, 3};
        int n = 5;

//        System.out.println("result : " + solution(n, a, b));

        for (char str : solution(n, a, b).toCharArray()) {
            System.out.println(str);
        }

    }

    public static String solution(int n, int[] a, int[] b) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";

        }

        return answer;
    }
}
