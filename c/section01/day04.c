#include <stdio.h>

/*
scanf : 키보드 입력을 받아서 저장
문자 (한글자), 문자열 (한 글자 이상의 여러 글자)
*/

int main(void)
{
    int input01, input02;
    printf("input number : ");
    // &input01 변수의 주소값
    scanf_s("%d %d", &input01, &input02);

    printf("result : %d\n", input01 + input02);

    char c = 'A';
    printf("%c\n", c);

    char str[256];
    scanf_s("%s", str, sizeof(str));

    printf("result : %s\n", str);

    return 0;
}
