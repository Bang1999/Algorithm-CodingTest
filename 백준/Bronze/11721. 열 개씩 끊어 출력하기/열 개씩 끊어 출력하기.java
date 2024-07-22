import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        int idx=0;
        while(sb.length()!=idx){
            if(idx%10==0 && idx!=0){
                System.out.println();
            }
            System.out.print(sb.charAt(idx++));
        }

    }
}