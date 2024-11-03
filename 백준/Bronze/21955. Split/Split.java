import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String num = br.readLine();
        
        System.out.println(num.substring(0, num.length()/2) + " " + num.substring(num.length()/2, num.length()));
    }
}