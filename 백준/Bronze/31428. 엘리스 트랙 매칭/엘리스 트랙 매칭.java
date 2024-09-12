import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        String s = br.readLine();
        int ans = 0;
        for(int i=0;i<T;i++){
            if(s.equals(str[i])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}