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
            
            int[] arr = new int[N*2];
            int[] ans = new int[N];
            
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int p=0;
            for(int i=0;i<arr.length;i++){
                if(arr[arr.length-i-1] !=0){
                    int k =arr[arr.length-i-1]/4*3;
                    ans[p++] = k;
                    
                    for(int j=0;j<arr.length-i;j++){
                   		if(arr[j] == k){
                        	arr[j] = 0;
                            break;
                    	}
                	}
                }
                arr[arr.length-i-1] = 0;
            }
            Arrays.sort(ans);
            
            
            System.out.print("#"+test_case+" ");
            for(int i=0;i<N;i++){
                System.out.print(ans[i] + " " );
            }
            System.out.println();
            
        }
	}
}