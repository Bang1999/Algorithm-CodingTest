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
            int M = sc.nextInt();
            
            int[] Ai = new int[N];
            int[] Bj = new int[M];
            
            for(int i=0;i<N;i++){
                Ai[i] = sc.nextInt();
            }
            for(int i=0;i<M;i++){
                Bj[i] = sc.nextInt();
            }
            
            if(M>N){
    	        int[] ans = new int[M-N+1];
	            for(int i=0;i<ans.length;i++){
                	for(int j=0;j<N;j++){
            	        ans[i] += Ai[j] * Bj[i+j];
    	            }
	            } 
            Arrays.sort(ans);
            System.out.println("#"+test_case + " " + ans[ans.length-1]);
            }else{
            	int[] ans = new int[N-M+1];
	            for(int i=0;i<ans.length;i++){
    	            for(int j=0;j<M;j++){
        	            ans[i] += Ai[i+j] * Bj[j];
                	}
            }
            Arrays.sort(ans);
            System.out.println("#"+test_case + " " + ans[ans.length-1]);   
            }
            
		}
	}
}