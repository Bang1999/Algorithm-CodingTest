import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] arr = new boolean[10001];

    public static void d(int n) {
        String s = "" + n;
        int sum = n;
        for(int i=0;i<s.length();i++) {
            sum += s.charAt(i) - '0';
        }
        if(sum <= 10000) {
            arr[sum] = true;
        }
    }
    public static void main(String[] args) { 
        for(int i=1;i<=10000;i++) {
            d(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<arr.length;i++) {
            if(!arr[i]) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}