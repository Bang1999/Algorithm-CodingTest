import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            String[] arr = br.readLine().split(" ");
            int sum = 0;
            int low = 100;
            for(int j=0;j<7;j++) {
                int a = Integer.parseInt(arr[j]);
                if(a % 2 == 0){
                    sum += a;
                    if(a < low){
                        low = a;
                    }
                }
            }
            System.out.println(sum + " " + low);
        }
    }
}