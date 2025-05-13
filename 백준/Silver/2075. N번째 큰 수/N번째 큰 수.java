import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String[] a = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                list.add(Integer.parseInt(a[j]));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-n));
    }
}