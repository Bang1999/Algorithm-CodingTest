#include <stdio.h>

int main(void)
{
    int n,i;
    int t=0;
    scanf("%d",&n);
    
    for(i = 1; i <= n;i++){
        t += i;
    }
    printf("%d\n",t);
    
    return 0;
}