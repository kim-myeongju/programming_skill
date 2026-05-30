package section05;

import java.util.Stack;

public class Solution01 {

    public static void main(String[] args) {
        /*
        * 올바른 괄호
        *
        * 올바른 괄호이면 YES, 올바르지 않은 괄호이면 NO 출력
        * 스택 자료구조 활용 (stack)
        *
        * input : (()(()))(()
        * output : NO
        * */

        System.out.println("result : " + solution("(()(()))(()"));
    }

    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) answer = "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = "NO";

        return answer;
    }
}
