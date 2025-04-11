import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        String[] b = br.readLine().split(" ");
        int[] arr = new int[n+1];
        for(int i=1;i<n+1;i++) {
            arr[i] = arr[i-1] + Integer.parseInt(b[i-1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            String[] k = br.readLine().split(" ");
            int sum = arr[Integer.parseInt(k[1])] - arr[Integer.parseInt(k[0])-1];
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}