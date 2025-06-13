import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int sum = 0;
        int tmp = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("1")) {
                sum += tmp + 1;
                tmp++;
            } else {
                tmp = 0;
            }
        }
        System.out.println(sum);
    }
}