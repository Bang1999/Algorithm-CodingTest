import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        while(!str[0].equals("#")){
            for(int i=0;i<str.length;i++){
                for(int j=str[i].length()-1;j>=0;j--){
                    System.out.print(str[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
            str = br.readLine().split(" ");
        }
    }
}