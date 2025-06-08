import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int A = 0;
        int B = 0;
        for(int i=0;i<a.length;i++) {
            A+=Integer.parseInt(a[i]);
        }
        for(int i=0;i<b.length;i++) {
            B+=Integer.parseInt(b[i]);
        }
        if(A>B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}