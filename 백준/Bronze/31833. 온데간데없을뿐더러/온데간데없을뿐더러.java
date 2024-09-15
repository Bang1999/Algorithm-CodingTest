import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        long A = 0L;
        long B = 0L;
        String aa = "";
        String bb = "";
        for(int i=0;i<a.length;i++){
            aa += "" + a[i];
        }
        for(int i=0;i<b.length;i++){
            bb += "" + b[i];
        }
        A = Long.valueOf(aa);
        B = Long.valueOf(bb);
        if(A > B){
            System.out.println(B);
        }else{
            System.out.println(A);
        }
    }
}