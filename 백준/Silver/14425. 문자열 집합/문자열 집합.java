import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split(" ");
        int n = Integer.parseInt(aa[0]);
        int m = Integer.parseInt(aa[1]);
        String[] arr = new String[n];
        int ans = 0;
        for(int i=0;i<n;i++) {
            arr[i] = br.readLine();
        }
        for(int i=0;i<m;i++) {
            String s = br.readLine();
            for(int j=0;j<arr.length;j++) {
                if(arr[j].equals(s)) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}