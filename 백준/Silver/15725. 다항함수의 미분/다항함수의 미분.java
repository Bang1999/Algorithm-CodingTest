import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = -1;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'x') {
                n = i;
                break;
            }
        }
        if(n == -1) {
            System.out.println(0);
        } else {
            String a = s.substring(0, n);
            if(a.equals("") || a.equals("+")) {
                System.out.println(1);
            } else if(a.equals("-")) {
                System.out.println(-1);
            } else {
                System.out.println(Integer.parseInt(a));
            }
        }
    }
}