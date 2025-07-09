import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        BigInteger ans = BigInteger.ONE;
        for(int i=1;i<=a;i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        for(int i=1;i<=b;i++) {
            ans = ans.divide(BigInteger.valueOf(i));
        }
        for(int i=1;i<=a-b;i++) {
            ans = ans.divide(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }
}