import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int two = count(n, 2) - count(m, 2) - count(n-m, 2);
        int five = count(n, 5) - count(m, 5) - count(n-m, 5);
        if(two < five) {
            System.out.println(two);
        } else {
            System.out.println(five);
        }
    }
    private static int count(int n, int p) {
        int count = 0;
        while (n >= p) {
            count += n / p;
            n /= p;
        }
        return count;
    }
}