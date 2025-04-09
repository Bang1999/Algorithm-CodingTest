import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        StringBuilder sb = new StringBuilder();
        for(int i=n;i<=m;i++) {
            if(so(i) == i) {
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
    public static int so(int n) {
        boolean a = false;
        if(n == 1) {
            return -1;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                a = true;
                break;
            }
        }
        if(a) {
            return -1;
        }
        return n;
    }
}