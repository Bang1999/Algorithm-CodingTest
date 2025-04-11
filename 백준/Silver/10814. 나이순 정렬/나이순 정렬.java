import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String>[] list = new List[201];
        for(int i=0;i<n;i++) {
            String[] arr = br.readLine().split(" ");
            if(list[Integer.parseInt(arr[0])] == null) {
                list[Integer.parseInt(arr[0])] = new ArrayList<>();
            }
            list[Integer.parseInt(arr[0])].add(arr[1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=200;i++) {
            if(list[i] != null) {
                for(int j=0;j<list[i].size();j++) {
                    sb.append(i + " " + list[i].get(j) + "\n");
                }
            }            
        }
        System.out.println(sb);
    }
}