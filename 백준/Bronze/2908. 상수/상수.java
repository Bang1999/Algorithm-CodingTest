import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] in = br.readLine().split(" ");
        
        String a = "";
        for(int i=in[0].length()-1;i>=0;i--){
            a += "" + in[0].charAt(i);
        }
        
        String b = "";
        for(int i=in[1].length()-1;i>=0;i--){
            b += "" + in[1].charAt(i);
        }
        
        if(Integer.parseInt(a) > Integer.parseInt(b)){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}