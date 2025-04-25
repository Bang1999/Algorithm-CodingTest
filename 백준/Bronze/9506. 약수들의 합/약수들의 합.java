import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(a!=-1) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<a;i++) {
                if(a%i==0) {
                    sum+=i;
                    list.add(i);
                }
            }
            if(a == sum) {
                sb.append(a + " = ");
                for(int i=0;i<list.size()-1;i++) {
                    sb.append(list.get(i) + " + ");
                }
                sb.append(list.get(list.size()-1)+"\n");
            } else {
                sb.append(a + " is NOT perfect.\n");
            }
            a = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}