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
            int[] f_day = new int[2];
            int[] l_day = new int[2];
            int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            f_day[0] = sc.nextInt();
            f_day[1] = sc.nextInt();
            l_day[0] = sc.nextInt();
            l_day[1] = sc.nextInt();

            
            int ans = 0;
            if(f_day[0] == l_day[0]){
                ans = l_day[1] - f_day[1] + 1;
            }else{
                ans += l_day[1];
                ans += day[f_day[0]] - f_day[1] + 1;
                int tmp = l_day[0];
                while(tmp-- != f_day[0]+1){
                    ans += day[tmp];
                }
                
            }
            
            
            
            System.out.println("#" + test_case + " " + ans);
		}
	}
}