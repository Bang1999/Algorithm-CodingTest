import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] q = br.readLine().split(" ");
        String[] arr = br.readLine().split(" ");
        String[] arr1 = br.readLine().split(" ");
        List<Integer> a = new ArrayList<>();
        Set<Integer> b = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            a.add(Integer.parseInt(arr[i]));
        }
        for(int i=0;i<arr1.length;i++) {
            b.add(Integer.parseInt(arr1[i]));
        }
        int n = 0;
        for(int i=0;i<arr.length;i++) {
            if(b.contains(a.get(i))) {
                n++;
            }
        }
        System.out.println(a.size() + b.size() - 2*n);
    }
}