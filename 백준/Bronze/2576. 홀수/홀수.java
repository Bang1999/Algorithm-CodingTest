import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int low = 100;
        for(int i=0;i<7;i++) {
            int n = Integer.parseInt(br.readLine());
            if(n%2 == 1){
                sum += n;
                if(n < low){
                    low = n;
                }
            }
        }
        if(low == 100){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(low);
        }
    }
}