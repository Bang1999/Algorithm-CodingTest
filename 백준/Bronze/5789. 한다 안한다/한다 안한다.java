import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String str = br.readLine();
            if(str.charAt(str.length()/2-1) == str.charAt(str.length()/2)){
                System.out.println("Do-it");
            }else{
                System.out.println("Do-it-Not");
            }
        }
    }
}