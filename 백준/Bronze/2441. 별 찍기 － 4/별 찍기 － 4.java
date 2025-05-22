import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            for(int a=0;a<i;a++) {
                sb.append(" ");
            }
            for(int b=n;b>i;b--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}