import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        int ans = 1;
        while(st.hasMoreTokens()){
            ans *= Integer.valueOf(st.nextToken());
        }
        
        System.out.println(ans);
    }
}