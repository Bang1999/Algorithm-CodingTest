import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isFBI = false;
        
        for(int i=0;i<5;i++){
            String str = br.readLine();
            if(str.contains("FBI")){
                isFBI = true;
                System.out.print((i+1) + " ");
            }
        }
        if(!isFBI){
            System.out.println("HE GOT AWAY!");
        }
        
    }
}