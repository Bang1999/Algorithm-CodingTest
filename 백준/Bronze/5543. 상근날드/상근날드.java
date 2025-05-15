import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int[] b = new int[2];
        
        a[0] = Integer.parseInt(br.readLine());
        a[1] = Integer.parseInt(br.readLine());
        a[2] = Integer.parseInt(br.readLine());
        b[0] = Integer.parseInt(br.readLine());
        b[1] = Integer.parseInt(br.readLine());
        
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a[0]+b[0]-50);
    }
}