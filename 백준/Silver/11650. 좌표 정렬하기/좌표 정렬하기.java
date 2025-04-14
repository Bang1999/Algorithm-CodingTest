import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = 0;
        int max = 0;
        for(int i=0;i<n;i++) {
            String[] ss = br.readLine().split(" ");
            int x = Integer.parseInt(ss[0]);
            int y = Integer.parseInt(ss[1]);
            if(map.get(x) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(x, list);
            } else {
                map.get(x).add(y);
            }
            if(x < min) {
                min = x;
            }
            if(x > max) {
                max = x;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=min;i<=max;i++) {
            if(map.containsKey(i)) {
                Collections.sort(map.get(i));
                for(int j=0;j<map.get(i).size();j++) {
                    sb.append(i + " " + map.get(i).get(j) + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}