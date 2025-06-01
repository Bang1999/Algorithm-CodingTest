import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Integer> value = new HashMap<>();
        value.put("black", 0);
        value.put("brown", 1);
        value.put("red", 2);
        value.put("orange", 3);
        value.put("yellow", 4);
        value.put("green", 5);
        value.put("blue", 6);
        value.put("violet", 7);
        value.put("grey", 8);
        value.put("white", 9);
        Map<String, Integer> m = new HashMap<>();
        m.put("black", 1);
        m.put("brown", 10);
        m.put("red", 100);
        m.put("orange", 1000);
        m.put("yellow", 10000);
        m.put("green", 100000);
        m.put("blue", 1000000);
        m.put("violet", 10000000);
        m.put("grey", 100000000);
        m.put("white", 1000000000);
        String s = br.readLine();
        long n = value.get(s)*10;
        s = br.readLine();
        n += value.get(s);
        s = br.readLine();
        n *= m.get(s);
        System.out.println(n);
    }
}