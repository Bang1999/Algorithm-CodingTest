import java.io.*;
import java.util.*;

public class Main {
    static int min = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        int[] ans = {a, 0};
        dfs(ans);
        System.out.println(min);
    }

    public static void dfs(int[] ans) {
        if (ans[0] == 1) {
            min = Math.min(min, ans[1]);
            return;
        }

        if (ans[1] >= min) return;
        
        if (ans[0] % 3 == 0) dfs(new int[]{ans[0] / 3, ans[1] + 1});
        if (ans[0] % 2 == 0) dfs(new int[]{ans[0] / 2, ans[1] + 1});
        
        dfs(new int[]{ans[0] - 1, ans[1] + 1});
    }
}
