import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int idx = Integer.valueOf(bf.readLine());
        System.out.println(str.charAt(idx-1));
    }
}