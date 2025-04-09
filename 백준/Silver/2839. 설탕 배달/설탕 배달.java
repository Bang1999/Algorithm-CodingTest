import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        int n = N/5;
        while(n != -1) {
            ans = n;
            if((N-5*n)%3 == 0) {
                ans += (N-5*n)/3;
                System.out.println(ans);
                break;
            }
            n--;
        }
        if(n == -1) {
            System.out.println(-1);
        }
    }
}