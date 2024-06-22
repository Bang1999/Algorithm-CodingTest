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
            String s = sc.next();
            
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2+1, s.length());
            
            
            if(s1.equals(s2)){
                
                boolean ans1 = true;
            ans1 = Check(s1);
            boolean ans2 = true;
            ans2 = Check(s2);
            
            
            if(ans1 == false || ans2 == false){
                System.out.println("#" + test_case+ " NO");
            }else{
                System.out.println("#" + test_case+" YES");
            }
                
            }else{
                System.out.println("#" + test_case+ " NO");
                
                
            }
            
            
            
            
        }
	}
    
    public static boolean Check(String s){
        boolean ans = true;
        Stack<Character> st = new Stack<Character>();
        if(s.length()%2 == 1){
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2+1, s.length());
            for(int i=0;i<s1.length();i++){
                st.push(s1.charAt(i));
            }
            
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i) != st.pop()){
                    ans = false;
                    break;
                }
            }
            
        }else{
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2, s.length());
            
            for(int i=0;i<s1.length();i++){
                st.push(s1.charAt(i));
            }
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i) != st.pop()){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}