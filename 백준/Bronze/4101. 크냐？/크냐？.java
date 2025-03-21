import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] b = br.readLine().split(" ");;
        int[] a = {Integer.parseInt(b[0]), Integer.parseInt(b[1])};
        
        while(a[0] != 0 && a[1] != 0){
            if(a[0] > a[1]){
                sb.append("Yes\n");
            }else{
                sb.append("No\n");
            }
            b = br.readLine().split(" ");
            a[0] = Integer.parseInt(b[0]);
            a[1] = Integer.parseInt(b[1]);
        }
        System.out.println(sb);
    }
}