import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0){
                st.push(a);
            } else {
                st.pop();
            }
        }
        if(st.isEmpty()) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}