import java.util.Scanner;
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
            int K = sc.nextInt();
            
            int[][] arr = new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            
            int[][] row = new int[N][N];
			int[][] col = new int[N][N];
            int ans =0;
            
            for(int i=0;i<N;i++){
				int max =0;
                int cnt =0;
                int n=0;
                for(int j=0;j<N;j++){
                    if(arr[i][j] == 1){
                        cnt++;
                    }else{
                        row[i][n++] = cnt;
                        cnt=0;
                    }
                }
                if(cnt!=0){
                    row[i][n] = cnt;
                }
            }
            
            for(int i=0;i<N;i++){
                int max =0;
                int cnt =0;
                int n=0;
                for(int j=0;j<N;j++){
                    if(arr[j][i] == 1){
                        cnt++;
                    }else{
                        col[i][n++] = cnt;
                        cnt=0;
                    }
                }
                if(cnt!=0){
                    col[i][n] = cnt;
                }
            }
            
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
	                if(K==row[i][j]){
    	                ans++;
        	        }
                    
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
        	        if(K==col[i][j]){
	                    ans++;
    	            }                 	   
                }
            }
            
            
            
            System.out.println("#"+test_case+" "+ans);
		}
	}
}