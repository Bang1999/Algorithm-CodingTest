import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);
        System.out.println(a.multiply(b));
    }
}