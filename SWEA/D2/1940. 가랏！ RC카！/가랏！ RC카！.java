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
            int[][] arr = new int[N][2];
            int ans = 0;
            int a =0;
            for(int i=0;i<arr.length;i++){
                arr[i][0] = sc.nextInt();
                if(arr[i][0] == 0){
                    ans += a;
                    continue;
                }else{
                    arr[i][1] = sc.nextInt();
                }
                
                if(arr[i][0] == 1){
                    a+=arr[i][1];
                    ans += a;
                }else{
                    a -= arr[i][1];
                    if(a < 0){
                        a = 0;
                    }
                    ans +=a;
                }
            }
            
            if(ans <0){
                System.out.println("#" + test_case + " " + 0);
            }else{
                System.out.println("#" + test_case + " " + ans);
            }
            
            
            
		}
	}
}