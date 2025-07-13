import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int K = Integer.parseInt(arr[2]);
        
        int team = 0;
        while (K > 0) {
            if (N >= 2 * M) {
                N--;
            } else if (M >= N / 2) {
                M--;
            } else {
                N--;
            }
            K--;
        }

        team = Math.min(N / 2, M);
        System.out.println(team);
    }
}
