import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for(int i=1;i<n;i++) {
            String tmp = br.readLine();
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j) != tmp.charAt(j)) {
                    s = s.substring(0, j) + "?" + s.substring(j+1, s.length());
                }
            }
        }
        System.out.println(s);
    }
}