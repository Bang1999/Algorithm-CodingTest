import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String[] arr = br.readLine().split(" ");
            if(arr[1].equals("enter")) {
                map.put(arr[0], 0);
            } else {
                map.remove(arr[0]);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--) {
            System.out.println(list.get(i));
        }
    }
}