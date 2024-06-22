import java.util.*;
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
            int[] arr = new int[N];
            int K = sc.nextInt();
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            /*===================*/
            
            int ans;
            if(N == K){
                Arrays.sort(arr);
                ans = arr[arr.length-1] - arr[0];
            }else{
                Arrays.sort(arr);
                ans = arr[arr.length-1];
                for(int i=0;i<=arr.length-K;i++){
                    if(Math.abs(arr[i] - arr[i+K-1]) < ans){
                        ans = Math.abs(arr[i] - arr[i+K-1]);
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + ans);
        }
	}
}