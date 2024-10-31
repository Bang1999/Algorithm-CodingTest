import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
        long a = Long.valueOf(num[0]);
        long b = Long.valueOf(num[1]);
        long c = Long.valueOf(num[2]);
        
        System.out.println(a+b+c);
    }
}