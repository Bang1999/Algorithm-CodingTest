import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String total = br.readLine();
        
        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        
        for(int i=0;i<N;i++){
            String[] k = br.readLine().split(" ");
            int a = Integer.parseInt(k[0]);
            int b = Integer.parseInt(k[1]);
            sum += a*b;
        }
        
        if(total.equals("" + sum)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}