import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        BigInteger a1 = new BigInteger(a[0]);
        BigInteger a2 = new BigInteger(a[1]);
        System.out.println(a1.add(a2));
    }
}