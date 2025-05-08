import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        while(!arr[0].equals("0")) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            if(a+b<=c || b+c<=a || c+a<=b) {
                sb.append("Invalid\n");
            } else if (a==b && b==c && a==c) {
                sb.append("Equilateral\n");
            } else if(a==b || b==c || a==c) {
                sb.append("Isosceles\n");
            } else {
                sb.append("Scalene\n");
            }
            arr = br.readLine().split(" ");
        }
        System.out.println(sb);
    }
}