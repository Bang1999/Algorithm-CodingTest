import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        
        int ans = Integer.parseInt(A+B)-Integer.parseInt(C);
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        System.out.println(a+b-c);
        System.out.println(ans);
    }
}