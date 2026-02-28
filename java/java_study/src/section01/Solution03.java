package section01;

public class Solution03 {

    /*
    * 문장 속 단어 (indexOf(), substring())
    *
    * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성
    *
    * input : it is time to study
    * output : study
    * */

    public static void main(String[] args) {

        System.out.println("result : " + solution("it is time to study"));

    }

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;

        // split(" ")
//        String[] strArr = str.split(" ");
//        for (int i = 0; i < strArr.length; i++) {
//            int strLen = strArr[i].length();
//            if (strLen > max) {
//                max = strLen;
//                answer = strArr[i];
//            }
//        }

        // indexOf(), substring()
        int pos;
        // " "를 만나면 그 인덱스 번호를 반환, " "가 아니라면 -1 반환
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int strLen = tmp.length();
            if (strLen > max) {
                max = strLen;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        // 마지막 단어 점검
        if (str.length() > max) {
            answer = str;
        }

        return answer;
    }
}
