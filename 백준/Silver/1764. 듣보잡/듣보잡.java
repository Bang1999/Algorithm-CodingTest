import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        Set<String> name1 = new HashSet<>();
        for(int i=0;i<N;i++) {
            name1.add(br.readLine());
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<M;i++) {
            String name = br.readLine();
            if(name1.contains(name)) {
                ans.add(name);
            }
        }
        System.out.println(ans.size());
        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ans.size();i++) {
            sb.append(ans.get(i) + "\n");
        }
        System.out.println(sb);
        
        
    }
}