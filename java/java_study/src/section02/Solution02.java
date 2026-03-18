package section02;

public class Solution02 {

    public static void main(String[] args) {
        /*
        * 보이는 학생
        *
        * 선생님의 N명의 학생을 일렬로 세웠습니다. 일렬로 서있는 학생의 키가 앞에서부터 순서대로 주어질 때,
        * 맨 앞에 서있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램 작성
        * (어떤 학생이 자기 앞에 서있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않음)
        *
        * input : 130 135 148 140 145 150 150 153
        * output : 5
        * */

        int[] people = {130, 135, 148, 140, 145, 150, 150, 153};
        int result = solution(people);
        System.out.println("result : " + result);
    }

    public static int solution(int[] people) {
        int answer = 1;
        int max = people[0];

        for (int i = 1; i < people.length; i++) {
            if (people[i] > max) {
                max = people[i];
                answer++;
            }
        }

        return answer;
    }
}
