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
            int[] arr = new int[101];
            for(int i=0;i<1000;i++){
                int a = sc.nextInt();
                arr[a]++;
            }
// 입력완료
            int max=-1;
            int idx = -1;
            for(int i=100;i>=0;i--){
                if(arr[i] > max){
                    max = arr[i];
                    idx = i;
                }
            }
            
            System.out.println("#" + test_case + " " + idx);
		}
	}
}