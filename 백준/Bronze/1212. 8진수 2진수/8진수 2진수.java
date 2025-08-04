import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String e = br.readLine();
        StringBuilder ans = new StringBuilder();
        
        ans.append(Integer.toBinaryString(e.charAt(0) - '0'));
        for (int i = 1; i < e.length(); i++) {
            int n = e.charAt(i) - '0';
            String b = Integer.toBinaryString(n);
            ans.append(String.format("%3s", b).replace(' ', '0'));
        }
        System.out.println(ans.toString());
    }
}
