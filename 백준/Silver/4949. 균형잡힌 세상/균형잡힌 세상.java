import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = "";
        while(true) {
            s = br.readLine();
            if(s.equals(".")) {
                break;
            }
            
            Stack<Character> st = new Stack<>();
            boolean flag = true;
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c == '(' || c == '[') {
                    st.push(c);
                } else if(c == ')') {
                    if(st.isEmpty() || st.peek() != '(') {
                        flag = false;
                        break;
                    }
                    st.pop();
                } else if(c == ']') {
                    if(st.isEmpty() || st.peek() != '[') {
                        flag = false;
                        break;
                    }
                    st.pop();
                }                
            }            
            if(flag && st.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}