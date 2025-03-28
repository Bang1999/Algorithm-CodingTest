import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] arr = new int[a.length];
        for(int i=0;i<a.length;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}