#include <stdio.h>

int main(void)
{
    int a,b,i,t;
    
    scanf("%d",&t);
    
    for(i = 0; i < t;i++){
        scanf("%d %d\n",&a,&b);
        printf("%d\n",a+b);
    }
    
    return 0;
}
