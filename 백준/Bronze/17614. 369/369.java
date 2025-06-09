import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        Long a = Long.parseLong(br.readLine());
        for(long i=1;i<=a;i++) {
            String s = "" + i;
            for(int j=0;j<s.length();j++) {                
                if(s.charAt(j)=='3' || s.charAt(j)=='6' || s.charAt(j)=='9') {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}