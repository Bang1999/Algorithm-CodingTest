import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] arrInt = new int[3];
        arrInt[0] = Integer.parseInt(arr[0]);
        arrInt[1] = Integer.parseInt(arr[1]);
        arrInt[2] = Integer.parseInt(arr[2]);        
        Arrays.sort(arrInt);
        int answer = 0;
        if(arrInt[0] == arrInt[1] && arrInt[1] == arrInt[2]){
            answer = 10000 + arrInt[0]*1000;
        } else if(arrInt[0] == arrInt[1] || arrInt[1] == arrInt[2]) {
            answer = 1000 + arrInt[1]*100;
        } else {
            answer = arrInt[2]*100;
        }
        System.out.println(answer);
    }
}