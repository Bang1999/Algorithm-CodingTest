#include <stdio.h>

int main()
{
    int n,i;
    int t=0;
    int max=0;
    int array[9];
    for(i=0;i<9;i++){
        scanf("%d\n", &n);
        array[i]=n;
    }
    for(i=0;i<9;i++){
        if(max<array[i]){
            max=array[i];
            t=i+1;
        }
    }
    printf("%d\n", max);
    printf("%d\n", t);
    return 0;
}