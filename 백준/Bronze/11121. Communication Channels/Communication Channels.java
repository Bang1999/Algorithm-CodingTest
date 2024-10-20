import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] a = br.readLine().split(" ");
            if(a[0].equals(a[1])){
                System.out.println("OK");
            }else{
                System.out.println("ERROR");
            }
        }
    }
}