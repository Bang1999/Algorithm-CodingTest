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
            int M = sc.nextInt();
            
            String[] a = new String[N];
            String[] b = new String[M];
            
            for(int i=0;i<a.length;i++){
                a[i] = sc.next();
            }
            for(int i=0;i<b.length;i++){
                b[i] = sc.next();
            }
            int anscnt = sc.nextInt();
            int[] ans = new int[anscnt];
            for(int i=0;i<ans.length;i++){
                ans[i] = sc.nextInt();
            }
            
            List<String> ss = new ArrayList<>();
            boolean TF = true;                    
            int i=0;
            int j=0;
            while(TF){
                String k = a[i%N]+b[j%M];
                if(ss.contains(k)){
                    TF = false;
                    i++;
                    j++;
                }else{
                    ss.add(k);
                    i++;
                    j++;
                }
            }
            
            System.out.print("#" + test_case +" ");
            
            for(int f=0;f<ans.length;f++){
                System.out.print(ss.get((ans[f]-1)%ss.size()) + " ");
            }
            System.out.println();
            
            
            
        }
	}
}