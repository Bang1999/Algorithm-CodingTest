import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            String str = br.readLine();
            String str2 = "";
            for(int j=str.length()-1;j>=0;j--){
                str2 += "" + str.charAt(j);
            }
            int ans = Integer.parseInt(str) + Integer.parseInt(str2);
            str = String.valueOf(ans);
            boolean is = true;
            for(int j=0;j<str.length()/2;j++){
                if(str.charAt(j) != str.charAt(str.length()-1-j)){
                    is = false;
                    break;
                }
            }
            if(is){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}