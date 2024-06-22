import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            int ans =0;
            for(int i=2;i<arr.length-2;i++){
                if((arr[i] > arr[i-2] && arr[i] > arr[i-1]) && (arr[i] > arr[i+1] && arr[i] > arr[i+2])){
                    int l = 0;
                    int r = 0;
                    
                    if(arr[i-1] > arr[i-2]){
                         l = arr[i-1];
                    }else{
                        l = arr[i-2];
                    }
                    if(arr[i+1] > arr[i+2]){
                         r = arr[i+1];
                    }else{
                        r = arr[i+2];
                    }
                    
                    if(l > r){
                        ans += arr[i] - l;
                    }else{
                        ans += arr[i] - r;
                    }
                    
                    
                }
                
                
                
            }  
            
            
            System.out.println("#" + test_case + " " + ans);
        }
	}
}