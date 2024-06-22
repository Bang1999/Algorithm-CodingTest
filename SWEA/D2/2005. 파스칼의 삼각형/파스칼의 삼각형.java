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
			System.out.println("#"+test_case);
            int N = sc.nextInt();			
            
			int[][] arr = new int[N][N];
			for(int i=0;i<N;i++){
                arr[i][0] = 1;
                arr[i][i] = 1;
                if(i>=2){
                    for(int j=1;j<i;j++){
                        arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    }
                }
            }
            
            for(int i=0;i<N;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

		}
	}
}