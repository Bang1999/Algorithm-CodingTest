import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        while(!arr[0].equals("0")) {
            int[] a = new int[3];
            for(int i=0;i<arr.length;i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(a);
            if(a[2]*a[2] == a[0]*a[0] + a[1]*a[1]) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
            arr = br.readLine().split(" ");
        }
        System.out.println(sb);
    }
}