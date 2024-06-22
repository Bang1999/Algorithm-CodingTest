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
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            /*================*/
            
            int[][] arr_90 = new int[N][N];
            int[][] arr_180 = new int[N][N];
            int[][] arr_270 = new int[N][N];
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr_90[i][j] = arr[N-j-1][i];
                }
            }
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr_180[i][j] = arr_90[N-j-1][i];
                }
            }
            
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr_270[i][j] = arr_180[N-j-1][i];
                }
            }
            
            
            System.out.println("#"+test_case);      
           for(int i=0;i<N;i++){
               
               for(int a =0;a<N;a++){
                   System.out.print(arr_90[i][a]);
               }
               System.out.print(" ");
               for(int b =0;b<N;b++){
                   System.out.print(arr_180[i][b]);
               }
               System.out.print(" ");
               for(int c =0;c<N;c++){
                   System.out.print(arr_270[i][c]);
               }
               System.out.println();
               
               
           }
            
		}
	}
}