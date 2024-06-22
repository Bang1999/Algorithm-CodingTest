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
            int[][] arr = new int[8][2];
            arr[0][0] = 50000;
            arr[1][0] = 10000;
            arr[2][0] = 5000;
            arr[3][0] = 1000;
            arr[4][0] = 500;
            arr[5][0] = 100;
            arr[6][0] = 50;
            arr[7][0] = 10;
            for(int i=0;i<8;i++){
                arr[i][1] = N/arr[i][0];
                N %= arr[i][0];
            }
            
            System.out.println("#"+test_case);
            for(int i=0;i<8;i++){
                System.out.print(arr[i][1] + " ");
            }
            System.out.println();
            

		}
	}
}