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
      int qq = sc.nextInt();
      boolean ans = false;

      int[][] number = new int[10][2];
      for(int i=0;i<number.length;i++){
        number[i][0] = i;
      }
      int n=1;
      while(!ans){
        int N = qq*n++;
        int a = N;
        for(int i=0;i<String.valueOf(N).length();i++){
          int k =  a / (int)Math.pow(10, String.valueOf(N).length() - i-1);		// k=2
          if(k==0){
            number[0][1] = 1;
            continue;
          }else{
            a %= k*(int)Math.pow(10, String.valueOf(N).length() - i-1);
          }

          for(int j=0;j<number.length;j++){
            if(number[j][0] == k){
              number[j][1] = 1;
              break;
            }
          }
          a %= (int)Math.pow(10, String.valueOf(N).length() - i-1);

        }

        ans = Check(number);
        if(ans){
          qq = N;
        }


      }

      System.out.println("#" + test_case + " " +qq);
    }
  }


  public static boolean Check(int[][] number){
    for(int i=0;i<number.length;i++){
      if(number[i][1] != 1){
        return false;
      }
    }
    return true;
  }
}