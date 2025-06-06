import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int w = Integer.parseInt(n);
        BigInteger a = new BigInteger("1");
        for(int i=1;i<=w;i++) {
            a = a.multiply(new BigInteger(""+i));
        }
        String s = "" + a;
        int cnt = 0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}