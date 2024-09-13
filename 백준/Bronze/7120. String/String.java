import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ans = "" + str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1) != str.charAt(i)){
                ans += "" + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}