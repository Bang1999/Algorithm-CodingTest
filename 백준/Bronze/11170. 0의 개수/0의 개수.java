import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int r = 0;
            for(int j=a;j<=b;j++) {
                String l = "" + j;
                for(int q=0;q<l.length();q++) {
                    if(l.charAt(q) == '0') {
                        r++;
                    }
                }
            }
            System.out.println(r);
        }
    }
}