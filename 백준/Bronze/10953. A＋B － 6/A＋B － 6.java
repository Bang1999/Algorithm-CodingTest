import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            IntStream intStream = Arrays.stream(br.readLine().split(",")).mapToInt(x -> Integer.parseInt(x));
            int[] arr = intStream.toArray();
            System.out.println(arr[0]+arr[1]);
        }
    }
}