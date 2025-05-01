import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        while(!arr[0].equals("0") && !arr[1].equals("0")) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(b%a == 0) {
                sb.append("factor\n");
            } else if(a%b == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
            arr = br.readLine().split(" ");
        }
        System.out.println(sb);
    }
}