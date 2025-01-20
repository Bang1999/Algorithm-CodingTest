import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] nums = new int[30];

        for(int i=0;i<28;i++){
            int a = Integer.parseInt(br.readLine());
            nums[a-1] = 1;
        }

        int[] ans = new int[2];
        int j = 0;
        
        for(int i=0;i<30;i++){
            if(nums[i] != 1){
                ans[j++] = i+1;
            }
        }        

        StringBuilder sb = new StringBuilder();
        sb.append(ans[0] + "\n");
        sb.append(ans[1]);
        
        System.out.println(sb);
    }
}