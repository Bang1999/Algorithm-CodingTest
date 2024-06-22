import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
			
        for(int test_case = 1; test_case <= T; test_case++){
            String s = sc.next();
            int ans = 0;            
            
            for(int i=1;i<=10;i++){
				String a = "";

                for(int j=1;j<=s.length()/i;j++){
                    a += s.substring(0, i);
                }
                a+= s.substring(0, s.length()%i);
                
                if(s.equals(a)){
                    ans = i;
                    break;
                }
            }
            
			System.out.println("#" + test_case + " " + ans);
			
            
		}
	}
}