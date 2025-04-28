import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0.0;
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        double sum = 0.0;
        for(int i=0;i<20;i++) {
            String[] arr = br.readLine().split(" ");
            if("P".equals(arr[2])) {
                continue;
            }
            a += Double.valueOf(arr[1])*map.get(arr[2]);
            sum += Double.valueOf(arr[1]);
        }
        System.out.printf("%.6f", a/sum);
    }
}