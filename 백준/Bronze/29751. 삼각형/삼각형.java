import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] a = br.readLine().split(" ");
        System.out.println(Integer.parseInt(a[0]) * Integer.parseInt(a[1]) * 0.5);
    }
}