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
            int[][] clock = new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    clock[i][j] = sc.nextInt();
                }
            }
            
            int[] time = new int[2];
            time[0] = clock[0][0] + clock[1][0];
            time[1] = clock[0][1] + clock[1][1];
            
            if(time[1] >= 60){
                time[0] += time[1]/60;
                time[1] %= 60;
            }
            
            if(time[0] > 12){
                time[0] %=12;
            }
            if(time[0] == 0){
                time[0] = 12;
            }
            System.out.println("#"+test_case+ " " +  time[0] +" "+time[1]);
		}
	}
}