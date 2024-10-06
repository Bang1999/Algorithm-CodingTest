import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        System.out.print(str.charAt(0));
        for(int i=0;i<str.length()-2;i++){
            System.out.print("ee");
        }
        System.out.print(str.charAt(str.length()-1));
    }
}