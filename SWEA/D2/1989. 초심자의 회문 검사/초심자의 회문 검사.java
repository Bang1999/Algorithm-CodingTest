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
            String s = sc.next();
           	s.trim();

            char[][] ss = new char[2][s.length()];
			boolean TF = true;
            
            for(int i=0;i<s.length();i++){
                ss[0][i] = s.charAt(i);
            }
            for(int i=0;i<s.length();i++){
                ss[1][i] = s.charAt(s.length()-i-1);
            }            

            for(int i=0;i<s.length();i++){
                if(ss[0][i] != ss[1][i]){
                    TF = false;
                    break;
                }
            }
            
            if(TF == true){
                System.out.println("#" + test_case + " " + 1);
            }else{
                System.out.println("#" + test_case + " " + 0);                
            }
        }
	}
}