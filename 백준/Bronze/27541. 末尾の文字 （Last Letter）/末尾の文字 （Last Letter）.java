import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String str = br.readLine();
        if(str.charAt(str.length()-1) == 'G'){
            System.out.println(str.substring(0, str.length()-1));
        }else{
            System.out.println(str + "G");
        }
    }
}