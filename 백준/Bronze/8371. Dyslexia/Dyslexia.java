import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();
        int ans = 0;
        for(int i=0;i<T;i++){
            if(a.charAt(i) != b.charAt(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}