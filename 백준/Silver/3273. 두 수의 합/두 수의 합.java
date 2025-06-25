import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arrS = br.readLine().split(" ");
        int sum = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int nn = sum - arr[i];
            if(set.contains(nn)) {
                ans++;
            }
            set.add(arr[i]);
        }
        System.out.println(ans);
    }
}