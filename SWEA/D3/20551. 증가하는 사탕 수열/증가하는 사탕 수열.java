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
            int[] arr = new int[3];
            
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            
            /*=========입력============*/

            int ans = 0;
            
            if(arr[2] < 3 || arr[1] <2){
                ans = -1;
                System.out.println("#" + test_case + " " + ans);
                continue;
            }
            
            
            for(int i=2;i>0;i--){
                // 앞이 더 큼
                if(arr[i] - arr[i-1] <= 0){
                    
                    int a = arr[i-1] - arr[i] + 1;
                    ans += a;
                    arr[i-1] -=a;
                }
            }
            
            
            
            System.out.println("#" + test_case + " " + ans);
            
            
            
            
            
            
        }
	}
}