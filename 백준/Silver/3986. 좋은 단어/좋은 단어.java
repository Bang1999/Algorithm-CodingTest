import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            Stack<Character> st = new Stack<>();
            for(int j=0;j<s.length();j++) {
                char c = s.charAt(j);
                if(st.isEmpty()) {
                    st.push(c);
                } else if(st.peek() == 'A' && c == 'A') {
                    st.pop();
                } else if(st.peek() == 'B' && c == 'B') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
            if(st.isEmpty()){
                ans++;
            }
        }
        System.out.println(ans);
    }
}