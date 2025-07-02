import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                set.add(Integer.parseInt(arr[j]));
            }
            int m = Integer.parseInt(br.readLine());
            String[] arr2 = br.readLine().split(" ");
            for(int j=0;j<m;j++) {
                int a = Integer.parseInt(arr2[j]);
                if(set.contains(a)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        System.out.println(sb);
    }
}