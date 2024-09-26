import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String me = br.readLine();
        int T = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i=0;i<T;i++){
            String str = br.readLine();
            if(str.equals(me)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}