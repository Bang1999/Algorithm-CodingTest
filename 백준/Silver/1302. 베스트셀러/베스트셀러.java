import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String ans = "";
        int max = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            if(!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s)+1);
            }
            if(map.get(s) > max) {
                max = map.get(s);
                ans = s;
            } else if(map.get(s) == max) {
                if(s.compareTo(ans) < 0) {
                    ans = s;
                }
            }
        }
        System.out.println(ans);
    }
}