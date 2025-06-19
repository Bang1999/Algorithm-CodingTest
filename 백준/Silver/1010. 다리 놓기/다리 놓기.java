import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] arr = br.readLine().split(" ");
            int r = Integer.parseInt(arr[0]);
            int n = Integer.parseInt(arr[1]);
            
            BigInteger ans = new BigInteger("1");
            for(int j=1;j<=n;j++) {
                ans = ans.multiply(BigInteger.valueOf(j));
            }
            for(int j=1;j<=r;j++) {
                ans = ans.divide(BigInteger.valueOf(j));
            }
            if(n-r == 0) {
                System.out.println(ans);
                continue;
            }
            for(int j=1;j<=n-r;j++) {
                ans = ans.divide(BigInteger.valueOf(j));
            }
            System.out.println(ans);
        }
    }
}