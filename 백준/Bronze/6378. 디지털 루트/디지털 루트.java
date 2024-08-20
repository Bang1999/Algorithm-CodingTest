import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        while(!str.equals("0")){
            str = br.readLine();
            if(str.equals("0")){
                break;
            }
            while(str.length() != 1){
                int n = 0;
                for(int i=0;i<str.length();i++){
                    n += str.charAt(i) - '0';
                }
                str = String.valueOf(n);
            }
            System.out.println(str);
        }
    }
}