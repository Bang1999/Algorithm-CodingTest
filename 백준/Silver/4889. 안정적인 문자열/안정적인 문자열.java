import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = 1;
        while(s.charAt(0) != '-') {
            Stack<Character> st = new Stack<>();
            int a = 0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == '{') {
                    st.push('{');
                } else {
                    if(!st.isEmpty()) {
                        st.pop();
                    } else {
                        a++;
                        st.push('{');
                    }
                }
            }
            a += st.size() / 2;
            sb.append(n + ". " + a + "\n");
            s = br.readLine();
            n++;
        }
        System.out.println(sb);        
    }
}