import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String a = br.readLine();
            if(a.charAt(a.length()-1) == '.'){
                System.out.println(a);
            }else{
                System.out.println(a + ".");
            }
        }
    }
}