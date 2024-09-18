import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(!"#".equals(str)){
            int ans = 0;
            char c = str.charAt(0);
            str = str.substring(2).toLowerCase();
            for(int i=0;i<str.length();i++){
                if(c == str.charAt(i)){
                    ans++;
                }
            }
            System.out.println(c + " " + ans);
            str = br.readLine();
        }
    }
}