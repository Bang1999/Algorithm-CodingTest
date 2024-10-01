import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        if(str.substring(0, 3).equals("555")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}