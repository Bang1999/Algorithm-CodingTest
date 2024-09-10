import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char a = str.charAt(0);
        int ans = 1;
        for(int i=1;i<str.length();i++){
            if(a == str.charAt(i)){
                ans++;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}