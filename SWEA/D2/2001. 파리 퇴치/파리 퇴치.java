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
            int M = sc.nextInt();
            
            int[][] arr = new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int max =0;
            
            for(int i=0;i<=N-M;i++){
                for(int j=0;j<=N-M;j++){
                    int sum =0;
                    for(int n = 0;n<M;n++){
                        for(int m=0;m<M;m++){
                            sum += arr[i+n][j+m];
                        }
                    }
                    if(sum > max){
                        max = sum;
                    }
                    
                }
            }
            
            System.out.printf("#%d %d\n", test_case, max);
            
            
            
            
		}
	}
}