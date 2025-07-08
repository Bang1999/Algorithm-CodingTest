import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> que = new ArrayDeque<>();
        for(int i=0;i<n;i++) {
            String[] a = br.readLine().split(" ");
            String s = a[0];
            switch(s) {
                case "push":
                    int val = Integer.parseInt(a[1]);
                    que.addLast(val);
                    break;
                case "pop":
                    sb.append(que.isEmpty() ? -1 : que.pollFirst()).append("\n");
                    break;
                case "size":
                    sb.append(que.size() + "\n");
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(que.isEmpty() ? -1 : que.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}