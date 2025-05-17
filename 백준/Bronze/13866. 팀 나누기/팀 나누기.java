import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] a = br.readLine().split(" ");
        long[] b = new long[4];
        for(int i=0;i<4;i++) {
            b[i] = Long.parseLong(a[i]);
        }
        Arrays.sort(b);
        
        long c = Math.abs((b[0] + b[3]) - (b[1] + b[2]));
        long d = Math.abs((b[0] + b[1]) - (b[2] + b[3]));
        System.out.println(Math.min(c, d));
    }
}