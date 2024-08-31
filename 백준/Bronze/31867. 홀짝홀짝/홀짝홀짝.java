import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for(int i = 0;i < T;i++){
            if((str.charAt(i) - '0')%2 == 0){
                a++;
            }else{
                b++;
            }
        }
        
        if(a>b){
            System.out.println("0");
        }else if(a==b){
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
    }
}