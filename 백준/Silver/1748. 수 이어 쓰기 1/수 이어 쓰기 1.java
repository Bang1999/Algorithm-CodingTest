import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        for(int i=1;i<=n;i++) {
            int len = 0;
            int num = i;
            while (num > 0) {
                len++;
                num /= 10;
            }
            ans += len;
        }
        System.out.println(ans);
    }
}