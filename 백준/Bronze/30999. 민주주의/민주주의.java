import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] n = br.readLine().split(" ");
        int ans = 0;
        for(int i=0;i<Integer.parseInt(n[0]);i++){
            String str = br.readLine();
            int o = 0;
            int x = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == 'O'){
                    o++;
                }else{
                    x++;
                }
            }
            if(o>x){
                ans++;
            }
        }
        System.out.println(ans);
    }
}