import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) > b.charAt(i)){
                System.out.print(a.charAt(i));
            }else{
                System.out.print(b.charAt(i));
            }
        }
    }
}