#include <stdio.h>

int main(void)
{
    int a,b,i,t;
    
    scanf("%d",&t);
    
    for(i = 0; i < t;i++){
        scanf("%d%d\n",&a,&b);
        printf("Case #%d: %d + %d = %d\n",i+1,a,b,a+b);
    }
    
    return 0;
}
