import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int ans = 0;
        for(int i=0;i<N;i++) {
            if(Integer.parseInt(arr[i]) == 1) {
                continue;
            }
            if(check(Integer.parseInt(arr[i]))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int n) {
        for(int i=2;i<n;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}