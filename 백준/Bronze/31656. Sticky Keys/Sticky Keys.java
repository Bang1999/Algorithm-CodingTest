import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char a = str.charAt(0);
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(a == str.charAt(i)){
                continue;
            }else{
                System.out.print(str.charAt(i));
                a = str.charAt(i);
            }
        }
    }
}