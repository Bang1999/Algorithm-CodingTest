import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            String[] arr = br.readLine().split(" ");
            switch(arr[0]){
                case "push":
                    st.push(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    if(st.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(st.pop());
                    }
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "empty":
                    if(st.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(st.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(st.peek());
                    }
                    break;
            }
        }
    }
}