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
            String s = Integer.toString(test_case);
            int cnt =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9'){
                    cnt++;
                }
            }
            if(cnt!=0){
                for(int i=0;i<cnt;i++){
                    System.out.print("-");}
            }else{
                System.out.print(s);
            }
            System.out.print(" ");
		

		}
	}
}