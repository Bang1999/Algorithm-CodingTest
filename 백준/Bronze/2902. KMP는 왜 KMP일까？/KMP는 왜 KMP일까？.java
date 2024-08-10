import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split("-");
        
        for(int i=0;i<str.length;i++){
            System.out.print(str[i].charAt(0));
        }
    }
}