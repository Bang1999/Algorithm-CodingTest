import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) {
                break;
            }
            String[] ss = new String[n];
            int[] ii = new int[n];
            for(int i=0;i<n;i++) {
                String s = br.readLine();
                ss[i] = s;
            }
            for(int i=0;i<2*n-1;i++) {
                String[] arr = br.readLine().split(" ");
                int a = Integer.parseInt(arr[0]);
                ii[a-1]++;
            }
            for(int i=0;i<n;i++) {
                if(ii[i]!=2) {
                    sb.append(cnt+" "+ss[i]+"\n");
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(sb);
        
    }
}