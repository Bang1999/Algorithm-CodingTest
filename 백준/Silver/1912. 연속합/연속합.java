import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        
        int max = arr[0];
        int sum = arr[0];
        
        for(int i=1;i<n;i++) {
            if(sum + arr[i] < arr[i]) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}