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

      char[] dic = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
          'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
      String ans = "";
      String l = "";
      for(int i=0;i<s.length();i++){
        for(int k=0;k<dic.length;k++){
          if(s.charAt(i) == dic[k]){
            for(int j=32;j>=1;j/=2){
              if(k-j>=0){
                l+="1";
                k-=j;
              }else{
                l+="0";
              }
            }
            break;
          }
        }
      }


      for(int i=0;i<l.length()/8;i++){
        int num=0;
        for(int j=i*8;j<i*8+8;j++){
          if(l.charAt(j) =='1'){
            num += (int)Math.pow(2, 7-j%8);
          }
        }
        ans += String.valueOf((char)num);
      }

      System.out.println("#"+test_case+" "+ans);
    }
  }
}
