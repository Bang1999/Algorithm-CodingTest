import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            System.out.print("Distances: ");
            String[] str = br.readLine().split(" ");
            for(int j=0;j<str[0].length();j++) {
                
                if(str[1].charAt(j) >= str[0].charAt(j)){
                    System.out.print((str[1].charAt(j) - str[0].charAt(j)) + " ");
                }else{
                    System.out.print((str[1].charAt(j) - str[0].charAt(j) + 26) + " ");
                }
            }
            System.out.println();
        }
    }
}