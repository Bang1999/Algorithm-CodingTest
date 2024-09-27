import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        if(str.contains("gori")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}