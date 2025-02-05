import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        System.out.println(a[1]);
    }
}