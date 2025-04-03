import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        BigInteger n = new BigInteger(arr[0]);
        BigInteger m = new BigInteger(arr[1]);

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}