import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            System.out.println("String #" + (i+1));
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == 'Z'){
                    System.out.print('A');
                    continue;
                }
                System.out.print((char)((int)str.charAt(j) + 1));
            }
            System.out.println("\n");
        }
    }
}