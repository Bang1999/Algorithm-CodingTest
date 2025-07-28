import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<N;i++) {
            String[] arr = br.readLine().split("\\.");
            map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
        }
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}