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
            
            int[][] arr = new int[N][N];
            
            int cnt =1;
            int a =0;
            int b =0;
            int c = N-1;
            int d = N-1;
            
            while(cnt <= N*N){
                for(int i=a;i<=c;i++){
                    arr[a][i] = cnt++;
                }
                a++;
                for(int i=b+1;i<=d;i++){
                    arr[i][c] = cnt++;
                }
                b++;
                for(int i=c-1;i>=a-1;i--){
                    arr[d][i] = cnt++;
                }
                c--;
                for(int i=d-1;i>=a;i--){
                    arr[i][a-1] = cnt++;
                }
                d--;
            }
            
            System.out.println("#" + test_case);
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
		}
	}
}