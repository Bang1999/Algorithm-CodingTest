import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            switch(s.charAt(0)) {
                case '1':
                    st.push(Integer.parseInt(s.substring(2)));
                    break;
                case '2':
                    if(!st.isEmpty()) {
                        System.out.println(st.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case '3':
                    System.out.println(st.size());
                    break;
                case '4':
                    if(st.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case '5':
                    if(!st.isEmpty()) {
                        System.out.println(st.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}