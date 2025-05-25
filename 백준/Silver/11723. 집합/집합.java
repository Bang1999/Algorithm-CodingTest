import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] present = new boolean[21];  // 1~20 사용

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String cmd = arr[0];
            int x = arr.length > 1 ? Integer.parseInt(arr[1]) : -1;

            switch (cmd) {
                case "add":
                    present[x] = true;
                    break;
                case "remove":
                    present[x] = false;
                    break;
                case "check":
                    sb.append(present[x] ? '1' : '0').append('\n');
                    break;
                case "toggle":
                    present[x] = !present[x];
                    break;
                case "all":
                    Arrays.fill(present, 1, 21, true);
                    break;
                case "empty":
                    Arrays.fill(present, 1, 21, false);
                    break;
            }
        }

        System.out.print(sb);
    }
}
