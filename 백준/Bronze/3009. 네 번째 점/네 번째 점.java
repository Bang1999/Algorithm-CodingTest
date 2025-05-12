import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        String ans = "";
        if(a[0].equals(b[0])) {
            ans += c[0] + " ";
        } else if(a[0].equals(c[0])) {
            ans += b[0] + " ";
        } else {
            ans += a[0] + " ";
        }
        
        if(a[1].equals(b[1])) {
            ans += c[1];
        } else if(a[1].equals(c[1])) {
            ans += b[1];
        } else {
            ans += a[1];
        }
        
        System.out.println(ans);
    }
}