#include <stdio.h>

int main(void)
{
    int i,j,k,n;
    
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<n-i-1;j++)
            printf(" ");
        for(k=-1;k<i;k++)
            printf("*");
        printf("\n");
    }
    return 0;
}

