import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = 0;
        Map<String, Integer> map = new HashMap<>();
        while(a != s.length()+1) {
            for(int i=0;i<a;i++) {
                if(!map.containsKey(s.substring(i, a))) {
                    map.put(s.substring(i, a), 0);
                }
            }
            a++;
        }
        System.out.println(map.size());
    }
}