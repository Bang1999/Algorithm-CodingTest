import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i=0;i<T;i++){
            String str = br.readLine();
            if(str.contains("01") || str.contains("OI")){
                ans++;
            }
        }
        System.out.println(ans);
    }
}