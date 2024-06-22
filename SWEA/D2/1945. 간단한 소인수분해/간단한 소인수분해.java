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
            int[] arr = new int[5];
            
            while(N%2 == 0){
                arr[0]++;
                N/=2;
            }
            while(N%3 == 0){
                arr[1]++;
                N/=3;
            }
            while(N%5 == 0){
                arr[2]++;
                N/=5;
            }
            while(N%7 == 0){
                arr[3]++;
                N/=7;
            }
            while(N%11 == 0){
                arr[4]++;
                N/=11;
            }
            System.out.print("#"+test_case + " ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
		}
	}
}