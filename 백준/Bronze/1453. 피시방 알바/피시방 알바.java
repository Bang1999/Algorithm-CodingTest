import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        boolean[] flag = new boolean[101];
        int ans = 0;
        for(int i=0;i<n;i++) {
            int c = Integer.parseInt(arr[i]);
            if(flag[c] == true) {
                ans++;
            } else {
                flag[c] = true;
            }
        }
        System.out.println(ans);
    }
}