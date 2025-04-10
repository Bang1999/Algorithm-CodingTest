import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(a[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");
        for(int i=0;i<m;i++) {            
            if(set.contains(b[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}