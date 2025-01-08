import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] a = br.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int w = Integer.parseInt(a[2]);
        int h = Integer.parseInt(a[3]);
        
        int q = 0;
        int k = 0;
        
        if(x - w < 0){
            q = w - x;
        }
        if(y - h < 0){
            k = h - y;
        }

        int[] o = {x, y, q, k};
        Arrays.sort(o);
        System.out.println(o[0]);
    }
}