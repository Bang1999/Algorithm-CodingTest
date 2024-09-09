import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        a = a.substring(0, 5);
        int T = Integer.parseInt(br.readLine());
        
        int ans = 0;
        String[] s = new String[T];
        for(int i=0;i<s.length;i++){
            s[i] = br.readLine();
            s[i] = s[i].substring(0, 5);
            if(a.equals(s[i])){
                ans++;
            }
        }
        System.out.println(ans);

    }
}