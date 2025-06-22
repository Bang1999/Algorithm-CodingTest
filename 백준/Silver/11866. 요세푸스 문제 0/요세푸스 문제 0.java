import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            list.add(i);
        }
        int idx = 0;
        List<Integer> ans = new ArrayList<>();
        while(list.size()!=0) {
            idx = (idx + k - 1) % list.size();
            ans.add(list.remove(idx));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0;i<ans.size()-1;i++) {
            sb.append(ans.get(i)+", ");
        }
        sb.append(ans.get(ans.size()-1)+">");
        System.out.println(sb);
    }
}