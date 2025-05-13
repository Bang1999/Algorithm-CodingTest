import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int[] arr3 = new int[arr2.length];
        for(int i=0;i<arr2.length;i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(arr3);
        System.out.println(arr3[Integer.parseInt(arr1[1])-1]);
    }
}