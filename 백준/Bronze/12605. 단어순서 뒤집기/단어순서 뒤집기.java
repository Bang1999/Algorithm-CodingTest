import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            String[] str = br.readLine().split(" ");
            System.out.print("Case #" + (i+1) + ": ");
            for(int j=str.length-1;j>=0;j--){
                System.out.print(str[j] + " ");
            }
            System.out.println();
        }
    }
}