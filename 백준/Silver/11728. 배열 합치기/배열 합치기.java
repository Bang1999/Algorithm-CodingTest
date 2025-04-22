import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            String[] s = br.readLine().split(" ");
            for(int j=0;j<s.length;j++) {
                list.add(Integer.parseInt(s[j]));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++) {
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb);
    }
}