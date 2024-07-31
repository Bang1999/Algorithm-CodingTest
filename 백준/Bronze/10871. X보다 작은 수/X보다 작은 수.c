#include <stdio.h>

int main(void)
{
    int x,n,i,t;
    
    scanf("%d %d",&n,&x);
    
    for(i=0;i<n;i++)
    {
        scanf("%d",&t);
        if(t<x)
            printf("%d ", t);
        
    }
    return 0;
}
