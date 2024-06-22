import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            long ans = 0L;
			int k = 0;		
            while(k!=N){
				int[] a = new int[N-k];
                int b=0;
                for(int i=k;i<N;i++){
                a[b++] = arr[i];
            	}
                Arrays.sort(a);
            	int max = a[N-k-1];
            	for(int i=k;i<N;i++){
                	if(arr[i] != max){
                    	ans += max - arr[i];
                	}else{
                    	k = i+1;
                    	break;
                	}
            	}
            }
            
            System.out.printf("#%d %d\n", test_case, ans);
		}
	}
}