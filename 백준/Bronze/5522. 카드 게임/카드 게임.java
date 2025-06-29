import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int ans = 0;
        while ((s = br.readLine()) != null && !s.equals("")) {
            ans += Integer.parseInt(s);
        }
        System.out.println(ans);
    }
}