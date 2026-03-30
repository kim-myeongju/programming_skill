package section02;

public class Solution04 {

    public static void main(String[] args) {
        /*
        * 피보나치 수열
        * 1. 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열.
        * 2. 입력은 피보나치 수열의 총 항의 수이다. 만약 7을 입력하면 1 1 2 3 5 8 13을 출력
        *
        * input : 10
        * output : 1 1 2 3 5 8 13 21 34 55
        * */

        System.out.print("result1 : ");
        for (int n : solution1(10)) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("result2 : ");
        solution2(10);
    }

    public static int[] solution1(int num) {
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void solution2(int num) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
