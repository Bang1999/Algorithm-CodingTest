#include <stdio.h>

int main(void)
{
    int h,m,a;
    
    scanf("%d%d", &h,&m);
    a=m-45;
    
    if(a>=0)
        printf("%d %d\n",h,a);
    else
        if(h==0)
            printf("23 %d\n",(60+a));
        else
            printf("%d %d\n", (h-1), (60+a));
    
    return 0;
}
