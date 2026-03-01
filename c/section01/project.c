#include <stdio.h>

/*
game project
경찰서 조서 쓰기 : 이름, 나이, 몸무게, 키, 뭘 잘못했는지
제작하기
*/

int main(void)
{
    char name[256];
    printf("name : ");
    scanf_s("%s", name, sizeof(name));

    int age;
    printf("age : ");
    scanf_s("%d", &age);

    float height;
    printf("height(cm) : ");
    scanf("%f", &height);

    double weight;
    printf("weight(kg) : ");
    scanf_s("%lf", &weight);

    char what[256];
    printf("what : ");
    scanf_s("%s", what, sizeof(what));

    printf("\n-- information --\n\n");
    printf("name        : %s\n", name);
    printf("age         : %d\n", age);
    printf("height(cm)  : %.1f\n", height);
    printf("weight(kg)  : %.2lf\n", weight);
    printf("what        : %s\n", what);

    return 0;
}
