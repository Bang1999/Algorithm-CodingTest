import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int[] arr = new int[b.length];
        for(int i=0;i<b.length;i++) {
            arr[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-Integer.parseInt(a[1])]);
    }
}