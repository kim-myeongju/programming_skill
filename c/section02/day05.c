#include <stdio.h>

/*
이중반복문 ⭐ 피라미드 만들기
*/

int main(void)
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    printf("======================\n");
    for (int i = 0; i < 5; i++)
    {
        for (int j = i; j < 5 - 1; j++)
        {
            printf(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
