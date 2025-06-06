import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            String[] q = br.readLine().split(" ");
            int a = Integer.parseInt(q[0]);
            int b = Integer.parseInt(q[1]);
            int c = Integer.parseInt(q[2]);
            if(a==b&&b==c) {
                arr[i] = 10000 + a*1000;
            } else if(a==b) {
                arr[i] = 1000 + a*100;
            } else if(b==c) {
                arr[i] = 1000 + b*100;
            } else if(c==a) {
                arr[i] = 1000 + c*100;
            } else {
                int[] aa = {a, b, c};
                Arrays.sort(aa);
                arr[i] = aa[2]*100;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);        
    }
}