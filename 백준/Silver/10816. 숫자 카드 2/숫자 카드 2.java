import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        String[] aa = br.readLine().split(" ");
        int b = Integer.parseInt(br.readLine().trim());
        String[] bb = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<a;i++) {
            if(!map.containsKey(aa[i])) {
                map.put(aa[i], 1);
            } else {
                map.put(aa[i], map.get(aa[i])+1);
            }
        }
        for(int i=0;i<b;i++) {
            if(!map.containsKey(bb[i])) {
                sb.append("0 ");
            } else {
                sb.append(map.get(bb[i]) + " ");
            }
        }
        System.out.println(sb);
    }
}