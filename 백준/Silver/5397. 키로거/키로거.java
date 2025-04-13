import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            Stack<Character> stL = new Stack<>();
            Stack<Character> stR = new Stack<>();
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j) == '>') {
                    if(!stR.isEmpty()) stL.push(stR.pop());
                } else if(s.charAt(j) == '<') {
                    if(!stL.isEmpty()) stR.push(stL.pop());
                } else if(s.charAt(j) == '-') {
                    if(!stL.isEmpty()) stL.pop();
                } else {
                    stL.push(s.charAt(j));
                }
            }
            for(int j=0;j<stL.size();j++) {
                sb.append(stL.get(j));
            }
            while(!stR.isEmpty()) {
                sb.append(stR.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}