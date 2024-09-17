import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        while(str!=null){
            int[] n = {0, 0, 0, 0};
            
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == ' '){
                    n[3]++;
                }else if(str.charAt(i) < 97 && str.charAt(i) >= 65){
                    n[1]++;
                }else if(str.charAt(i) >= 97){
                    n[0]++;
                }else{
                    n[2]++;
                }
            }
            for(int i=0;i<4;i++){
                System.out.print(n[i] + " ");
            }
            System.out.println();
            str = br.readLine();
        }
    }
}