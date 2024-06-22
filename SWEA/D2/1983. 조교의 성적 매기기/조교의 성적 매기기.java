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
            int K = sc.nextInt();
            
            int[][] arr = new int[N][3];
            for(int i=0;i<N;i++){
                for(int j=0;j<3;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            double[] score = new double[N];
            for(int i=0;i<N;i++){
                    score[i] = arr[i][0]*0.35 + arr[i][1]*0.45 + arr[i][2]*0.2;
            }
            
            double[] a = new double[N];
            for(int i=0;i<N;i++){
                a[i] = score[i];
            }
            Arrays.sort(a);
            int n = -1;
            for(int i=0;i<N;i++){
                if(score[K-1] == a[i]){
                    n = N-i;
                }
            }

            if((double)n/10*10<= N/10){
                System.out.println("#"+test_case+ " A+");
            }else if((double)n/10*10<= N/10*2){
                System.out.println("#"+test_case+ " A0");
            }else if((double)n/10*10<= N/10*3){
                System.out.println("#"+test_case+ " A-");
            }else if((double)n/10*10<= N/10*4){
                System.out.println("#"+test_case+ " B+");
            }else if((double)n/10*10<= N/10*5){
                System.out.println("#"+test_case+ " B0");
            }else if((double)n/10*10<= N/10*6){
                System.out.println("#"+test_case+ " B-");
            }else if((double)n/10*10<= N/10*7){
                System.out.println("#"+test_case+ " C+");
            }else if((double)n/10*10<= N/10*8){
                System.out.println("#"+test_case+ " C0");
            }else if((double)n/10*10<= N/10*9){
                System.out.println("#"+test_case+ " C-");
            }else{
                System.out.println("#"+test_case+ " D0");
            }
            
            
		}
	}
}