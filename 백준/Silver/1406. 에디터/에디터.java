import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<Character> sl = new Stack<>();
        Stack<Character> sr = new Stack<>();

        for(int i=0;i<s.length();i++) {
            sl.push(s.charAt(i));
        }
        for(int i=0;i<n;i++) {
            String ss = br.readLine();
            char c = ss.charAt(0);
            switch(c){
                case 'P':
                    sl.push(ss.charAt(2));
                    break;
                case 'B':
                    if (!sl.isEmpty()) sl.pop();
                    break;
                case 'L':
                    if (!sl.isEmpty()) sr.push(sl.pop());
                    break;
                case 'D':
                    if (!sr.isEmpty()) sl.push(sr.pop());
                    break;
            }
        }
        while(!sl.isEmpty()) {
            sr.push(sl.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!sr.isEmpty()) {
            sb.append(sr.pop());
        }
        
        System.out.println(sb);
    }
}