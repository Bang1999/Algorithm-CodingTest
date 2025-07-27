import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long val = Long.parseLong(br.readLine());
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        long ans = 0;
        int max = 0;
        List<Long> keyList = new ArrayList<>(map.keySet());
        for (int i = 0; i < keyList.size(); i++) {
            long key = keyList.get(i);
            int value = map.get(key);
            if (value > max) {
                max = value;
                ans = key;
            } else if (value == max && key < ans) {
                ans = key;
            }
        }

        System.out.println(ans);
    }
}