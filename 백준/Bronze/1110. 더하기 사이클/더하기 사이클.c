#include <stdio.h>

int main(void)
{
    int original;
    int n = 0;
    int a = 0;
    int b = 0;
    int first = 0;
    int result = -1;
    
    scanf("%d", &original);
    
        if(original<10)
            original=original*10;
        first = original;
        while(first != result)
        {
            a=original/10;  //십의 자리수
            b=original%10;  //일의 자리수
            result = ((10*b)+((a+b)%10));
            original = result;
            n++;
        }
    
    printf("%d\n",n);
    return 0;
}