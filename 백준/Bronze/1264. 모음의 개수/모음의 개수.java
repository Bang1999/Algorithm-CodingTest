import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine().toLowerCase();
        while(!("#".equals(str))){
            int cnt = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e')
                    cnt++;
            }
            System.out.println(cnt);
            
            str = br.readLine().toLowerCase();
        }
    }
}