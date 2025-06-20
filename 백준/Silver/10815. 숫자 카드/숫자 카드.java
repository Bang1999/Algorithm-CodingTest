import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            int a = Integer.parseInt(arr[i]);
            set.add(a);
        }
        int m = Integer.parseInt(br.readLine());
        String[] ar = br.readLine().split(" ");
        int[] b = new int[m];
        for(int i=0;i<m;i++) {
            b[i] = Integer.parseInt(ar[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            if(set.contains(b[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}