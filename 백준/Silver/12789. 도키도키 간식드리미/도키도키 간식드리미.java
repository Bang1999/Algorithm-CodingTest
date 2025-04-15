import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Stack<Integer> st = new Stack<>();
        int q = 1;
        for(int i=0;i<arr.length;i++) {
            int a = Integer.parseInt(arr[i]);
            while (!st.isEmpty() && st.peek() == q) {
                st.pop();
                q++;
            }
            if(a == q) {
                q++;
                continue;
            } else {
                st.push(a);
            }
        }
        boolean flag = true;
        while(!st.isEmpty()) {
            if(q == n) {
                break;
            }
            if(st.peek() != q) {
                flag = false;
                break;
            } else {
                st.pop();
                q++;
            }
        }
        if(flag) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}