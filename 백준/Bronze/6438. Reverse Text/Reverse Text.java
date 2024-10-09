import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        String[] str;
        
        for(int i=0;i<T;i++){
            str = br.readLine().split(" ");
            for(int j=str.length-1;j>=0;j--){
                for(int k=str[j].length()-1;k>=0;k--){
                    System.out.print(str[j].charAt(k));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}