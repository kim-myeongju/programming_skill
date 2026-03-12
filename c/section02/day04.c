#include <stdio.h>

/*
이중반복문
구구단 (2단 ~ 9단)
*/

int main(void)
{
    for (int i = 1; i <= 3; i++)
    {
        printf("1th for : %d\n", i);
        for (int j = 1; j <= 5; j++)
        {
            printf("    2nd for : %d\n", j);
        }
    }

    printf("============================\n");

    for (int i = 2; i <= 9; i++)
    {
        for (int j = 1; j <= 9; j++)
        {
            printf("%d * %d = %d\n", i, j, i * j);
        }
        printf("\n");
    }

    return 0;
}
