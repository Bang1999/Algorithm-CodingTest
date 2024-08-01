import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<T;i++){
            String str = br.readLine();
            int num = str.charAt(str.length()-1);
            if(num % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}