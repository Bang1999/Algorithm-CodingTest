#include <stdio.h>

		int main()
		{
		int a,b,c,i,total,rest;
		int num[10]={0,};

		scanf("%d",&a);
		scanf("%d",&b);
		scanf("%d",&c);
	
		total = a*b*c;
	
		while(total>0){
				rest=total%10;     //10으로 나눈 나머지가 일의 자리 숫자
				total=total/10;
				num[rest]++;
		}

		for(i=0;i<10;i++)
				printf("%d\n",num[i]);
	return 0;
}