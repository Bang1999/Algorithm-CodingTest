import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] arr = br.readLine().split(" ");
            int sum = 0;
            for(int j=1;j<arr.length;j++) {
                sum += Integer.parseInt(arr[j]);
            }
            double avg = sum / (1.0*(Integer.parseInt(arr[0])));
            int cnt = 0;
            for(int j=1;j<arr.length;j++) {
                if(Integer.parseInt(arr[j]) > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", 100.0*cnt/(Integer.parseInt(arr[0])));
        }
    }
}