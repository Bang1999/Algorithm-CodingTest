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
            int[] cnt = new int[N];
            String[] Ala = new String[N];
            for(int i=0;i<N;i++){
                Ala[i] = sc.next();
                cnt[i] = sc.nextInt();
            }
            
            System.out.println("#"+test_case);
            int c = 0;
            for(int i=0;i<N;i++){
                for(int j=0;j<cnt[i];j++){
                    System.out.print(Ala[i]);
                    c++;
                    if(c==10){
                        System.out.println();
                        c=0;
                    }
                }
            }
            if(c!=0){
                System.out.println();
            }
		}
	}
}