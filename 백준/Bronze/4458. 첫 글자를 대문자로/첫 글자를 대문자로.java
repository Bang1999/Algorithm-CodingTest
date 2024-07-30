import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.valueOf(br.readLine());
        for(int i=0;i<T;i++){
            String str = br.readLine();
            if((int)str.charAt(0) >= 97){
                System.out.println((char)(str.charAt(0)-32) + str.substring(1));    
            }else{
                System.out.println(str);
            }
        }
    }
}