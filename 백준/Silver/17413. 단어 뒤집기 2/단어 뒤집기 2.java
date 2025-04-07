import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        String s = br.readLine();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '<') {
                while(!st.isEmpty()) {
                    sb.append(st.pop());
                }
                while(s.charAt(i) != '>') {
                    sb.append(s.charAt(i++));
                }
                sb.append(s.charAt(i));
            } else if(s.charAt(i) != ' '){
                st.push(s.charAt(i));
            } else if(s.charAt(i) == ' ') {
                while(!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append(' ');
            }
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}