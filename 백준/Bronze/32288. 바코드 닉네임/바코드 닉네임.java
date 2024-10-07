import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0;i<cnt;i++){
            if(str.charAt(i) == 'I'){
                System.out.print("i");
            }else{
                System.out.print("L");
            }
        }
    }
}