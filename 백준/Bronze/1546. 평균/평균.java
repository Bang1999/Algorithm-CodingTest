import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        String[] arr = br.readLine().split(" ");
        double a = 0;
        Double[] sc = new Double[n];
        for(int i=0;i<n;i++) {
            sc[i] = Double.valueOf(arr[i]);
            if(a < sc[i]) {
                a = sc[i];
            }
        }
        for(int i=0;i<n;i++) {
            sc[i] /= a;
            sc[i] *= 100;
            sum += sc[i];
        }
        System.out.println(sum/n);
    }
}