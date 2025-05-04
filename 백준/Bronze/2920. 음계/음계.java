import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a2 = {8, 7, 6, 5, 4, 3, 2, 1};
        int a = 1;
        String ans = "";
        for(int i=0;i<s.length;i++) {
            if(!s[i].equals("" + a1[i])) {
                ans = "";
                break;
            } else {
                ans = "ascending";
            }
        }
        if(!ans.equals("")) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length;i++) {
            if(!s[i].equals("" + a2[i])) {
                ans = "";
                break;
            } else {
                ans = "descending";
            }
        }
        if(!ans.equals("")) {
            System.out.println(ans);
        } else {
            System.out.println("mixed");
        }
    }
}