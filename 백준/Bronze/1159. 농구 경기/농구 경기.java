import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            int k = s.charAt(0)-'a';
            arr[k]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                int q = 'a' + i;
                char w = (char) q;
                sb.append(w);
            }
        }
        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }
}
