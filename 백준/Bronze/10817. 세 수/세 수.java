import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
        
        int[] nums = {Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])};
        
        Arrays.sort(nums);
        
        System.out.println(nums[1]);
    }
}