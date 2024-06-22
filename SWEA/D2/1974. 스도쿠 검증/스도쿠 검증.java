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
            int[][] arr = new int[9][9];
            int ans = 1;
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int[] ch = new int[9];
            int n =0;
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    ch[n++] = arr[i][j];
                }
                n=0;
                Arrays.sort(ch);
                for(int m=0;m<9;m++){
                    if(ch[m] != m+1){
                        ans=0;
                    }
                }
            }
            
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    ch[n++] = arr[j][i];
                }
                n=0;
                Arrays.sort(ch);
                for(int m=0;m<9;m++){
                    if(ch[m] != m+1){
                        ans=0;
                    }
                }
            }
            
            
            for(int i=0;i<7;i+=3){
                for(int j=0;j<7;j+=3){
                    
                    for(int q=0;q<3;q++){
                        for(int p=0;p<3;p++){
                            ch[n++] = arr[i+q][j+p];
                        }
                    }
                    n=0;
                	Arrays.sort(ch);
                	for(int m=0;m<9;m++){
                    	if(ch[m] != m+1){
                        	ans=0;
	                    }	
             	   }
                    
                }
            }
            
            
            System.out.println("#"+test_case+" " + ans);
            
		}
	}
}