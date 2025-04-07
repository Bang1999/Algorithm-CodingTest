import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<>();
        Deque<Character> dq = new LinkedList<>();
        for(int i=0;i<n;i++) {
            String arr = br.readLine();
            if(arr.charAt(0) == '1') {
                st.push('1');
                dq.add(arr.charAt(2));
            } else if(arr.charAt(0) == '2') {
                st.push('2');
                dq.addFirst(arr.charAt(2));;
            } else {
                if(dq.isEmpty()) {
                    continue;
                }
                if(st.peek() == '1') {
                    st.pop();
                    dq.removeLast();
                } else {
                    st.pop();
                    dq.remove();
                }
            }
        }
        if(dq.isEmpty()) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()) {
            sb.append(dq.poll());
        }
        System.out.println(sb);
    }
}