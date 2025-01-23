import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int n = 0;
        
        for(int i=0;i<Integer.parseInt(input[0])-1;i++){
            n += month[i] % 7;
        }
        
        n += Integer.parseInt(input[1]);
        n--;
        n %= 7;
        
        System.out.println(day[n]);
    }
}