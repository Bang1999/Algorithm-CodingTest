import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        BigInteger a = new BigInteger(nums[0]);
        BigInteger b = new BigInteger(nums[1]);
        
        System.out.println(a.add(b));
    }
}