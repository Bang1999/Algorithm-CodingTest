import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int ans = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'S'){
                ans++;
            }else{
                ans++;
                i++;
            }
        }
        if(ans > T){
            System.out.println(T);                
        }else {
            System.out.println(ans);                
        }
    }
}