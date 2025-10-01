import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "a";
        int max = 0;
        List<Integer> list = new ArrayList<>();
        while(true) {
            s = br.readLine();
            if(s == null || s.equals("")) break;
            int a = Integer.parseInt(s);
            if(a%2 == 1) {
                max += a;
                list.add(a);
            }
        }
        if(max == 0) {
            System.out.println(-1);
        } else {
            Collections.sort(list);
            System.out.println(max);
            System.out.println(list.get(0));
        }
    }
}