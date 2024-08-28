import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] a = br.readLine().split("=");
        a[0] = a[0].trim();
        a[1] = a[1].trim();
        String[] b = a[0].split("\\+");
        b[0] = b[0].trim();
        b[1] = b[1].trim();
        
        int aa = Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
        if(aa == Integer.parseInt(a[1])){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}