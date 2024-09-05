import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
        
        System.out.println(rev(String.valueOf(rev(num[0]) + rev(num[1]))));
        
    }
    
    public static int rev(String a) {
        String b = "";
        
        for(int i=a.length()-1;i>=0;i--){
            b += "" + a.charAt(i);
        }
        
        return Integer.parseInt(b);
    }
}