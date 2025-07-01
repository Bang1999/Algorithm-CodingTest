import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int ans = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                ans += set.size();
                set.clear();
            } else {
                set.add(s);
            }
        }
        ans += set.size();
        System.out.println(ans);
    }
}