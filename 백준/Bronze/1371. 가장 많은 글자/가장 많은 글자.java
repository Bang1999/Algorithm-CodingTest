import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int a = 0;
        String s = br.readLine();
        while(s != null) {
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == ' ') {
                    continue;
                }
                arr[s.charAt(i)-'a']++;
                if(arr[s.charAt(i)-'a'] > a) {
                    a = arr[s.charAt(i)-'a'];
                }
            }
            s = br.readLine();
        }
        for(int i=0;i<arr.length;i++) {
            if(a==arr[i]) {
                System.out.print((char)(i+'a'));
            }
        }
    }
}