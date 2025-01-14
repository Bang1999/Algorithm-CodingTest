import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);
        int D = (V - B) / (A - B);
        
        if((V - B) % (A - B) > 0){
            D++;
        }
        
        System.out.println(D);
    }
}