package section05;

import java.util.Stack;

public class Solution03 {

    public static void main(String[] args) {
        /*
        * 크레인 인형뽑기
        *
        * input
        * > 인형
        * {0, 0, 0, 0, 0}
        * {0, 0, 1, 0, 3}
        * {0, 2, 5, 0, 1}
        * {4, 2, 4, 4, 2}
        * {3, 5, 1, 3, 1}
        *
        * > 순서
        * {1, 5, 3, 5, 1, 2, 1, 4}
        *
        * output : 4
        * */

        int[][] dolls = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] arr = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println("result : " + solution(dolls, arr));
    }

    public static int solution(int[][] board, int[] move) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : move) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    // 스택이 비어있지 않으면서 가장 위에 있는 인형이 방금뽑은 인형과 같으면 2개 꺼냄
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(tmp);
                    // 인형뽑기 작업 한번 끝나면 해당 반복문은 종룐시키고 move의 다음열로 넘어감
                    break;
                }
            }
        }

        return answer;
    }
}
