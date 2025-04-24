import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i=s.length()-1; i>=0;i-=3) {
            int a = 0;
            int k = 1;
            for (int j=0;j<3;j++) {
                if (i - j >= 0 && s.charAt(i - j) == '1') {
                    a += k;
                }
                k *= 2;
            }
            sb.append(a);
        }

        System.out.println(sb.reverse());
    }
}