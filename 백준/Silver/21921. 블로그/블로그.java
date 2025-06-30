import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        String[] arr = br.readLine().split(" ");
        int[] nums = new int[a];
        for(int i = 0; i < a; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        
        int sum = 0;
        for(int i = 0; i < b; i++) {
            sum += nums[i];
        }
        
        int max = sum;
        int cnt = 1;
        
        for(int i = b; i < a; i++) {
            sum = sum + nums[i] - nums[i - b];
            if(sum > max) {
                max = sum;
                cnt = 1;
            } else if(sum == max) {
                cnt++;
            }
        }
        
        if(max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(cnt);
        }
    }
}
