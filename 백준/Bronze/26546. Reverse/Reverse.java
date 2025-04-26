import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++) {
            String[] s = br.readLine().split(" ");
            String q = s[0];
            for(int j=0;j<Integer.parseInt(s[1]);j++) {
                sb.append(q.charAt(j));
            }
            for(int j=Integer.parseInt(s[2]);j<q.length();j++) {
                sb.append(q.charAt(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}