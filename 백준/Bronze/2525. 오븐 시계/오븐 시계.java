import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int p = Integer.parseInt(br.readLine().trim());
        h += p/60;
        m += p%60;
        h += m/60;
        m = m%60;
        h = h%24;
        System.out.println(h + " " + m);
    }
}