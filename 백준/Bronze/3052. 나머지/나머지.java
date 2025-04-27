import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        List<Integer> list = new ArrayList<Integer>();
        while(a != null) {
            int n = Integer.parseInt(a);
            int q = n%42;
            if(!list.contains(q)) {
                list.add(q);
            }
            a = br.readLine();
        }
        System.out.println(list.size());
    }
}