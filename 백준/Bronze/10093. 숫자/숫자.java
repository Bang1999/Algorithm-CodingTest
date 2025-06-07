import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        Long[] aa = {Long.parseLong(arr[0]), Long.parseLong(arr[1])};
        Arrays.sort(aa);
        StringBuilder sb = new StringBuilder();
        long a = aa[0];
        long b = aa[1];
        if(a==b) {
            System.out.println(0);
            return;
        }
        sb.append((b-a-1)+"\n");
        for(long i=a+1;i<b;i++) {
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}