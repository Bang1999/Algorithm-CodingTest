import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        String str = "WelcomeToSMUPC";
//        14
        a %= 14;
        if(a == 0){
            System.out.println(str.charAt(str.length()-1));
        }else{
            System.out.println(str.charAt(--a));
        }

        
        
    }
}