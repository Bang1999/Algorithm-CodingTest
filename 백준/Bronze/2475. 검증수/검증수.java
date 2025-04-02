import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = 0;
        for(int i=0;i<arr.length;i++){
            n += Integer.parseInt(arr[i])*Integer.parseInt(arr[i])%10;
        }
        n%=10;
        System.out.println(n);
    }
}