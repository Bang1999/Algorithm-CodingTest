import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] str = br.readLine().split(" ");
            int idx = Integer.parseInt(str[0]);
            System.out.println(str[1].substring(0, idx-1) + str[1].substring(idx, str[1].length()));
            
        }
    }
}