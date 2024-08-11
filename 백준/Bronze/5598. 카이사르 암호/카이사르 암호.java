import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 65 || str.charAt(i) == 66 ||str.charAt(i) == 67){
                int c = str.charAt(i) + 23;
                System.out.print((char)c);
            }else{
                int c = str.charAt(i) - 3;
                System.out.print((char)c);
            }
        }
    }
}