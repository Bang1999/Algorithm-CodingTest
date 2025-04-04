import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st1 = new Stack<>();
        String s = br.readLine();
        for(int i=0;i<s.length();i++) {
            st1.push(s.charAt(i));
        }
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(st2.isEmpty()){
                st2.push(st1.pop());
            } else if(st2.peek() == ')') {
                if(st1.peek() == '(') {
                    st1.pop();
                    st2.pop();
                } else {
                    st2.push(st1.pop());
                }
            } else if(st2.peek() == '(') {
                st2.push(st1.pop());
            }
        }
        System.out.println(st2.size());
    }
}