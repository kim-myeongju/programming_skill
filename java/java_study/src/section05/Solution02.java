package section05;

import java.util.Stack;

public class Solution02 {

    public static void main(String[] args) {
        /*
        * 괄호 문자 제거
        *
        * 입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램
        * STACK 자료구조 사용 (push, pop, size, get)
        * pop 은 제거한 그 값을 반환
        *
        * input : (A(BC)D)EF(G(H)(IJ)K)LM(N)
        * output : EFLM
        *
        * */

        System.out.println("result : " + solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)OP(Q)(RS(T))U"));
    }

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(c == ')') {
                while (stack.pop() != '(');
            } else stack.push(c);
        }

        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }
}
