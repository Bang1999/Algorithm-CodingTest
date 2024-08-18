import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String[] c = br.readLine().split(" ");

        for(int i=0;i<str.length();i++){
            for(int j=0;j<c.length;j++){
                if(str.charAt(i)==c[j].charAt(0)){
                str = str.substring(0,i) + String.valueOf(c[j].charAt(0)).toLowerCase() + str.substring(i+1, str.length());
            }
            }
        }
        System.out.println(str);
    }
}