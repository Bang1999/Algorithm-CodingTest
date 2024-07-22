import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());


        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)<97){
                System.out.print((char)(sb.charAt(i)+32));
            }else {
                System.out.print((char)(sb.charAt(i)-32));
            }
        }
        br.close();
    }
}