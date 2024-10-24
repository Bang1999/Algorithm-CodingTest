import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        
        if(a.length() > 2 && a.charAt(1) == 'o'){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}