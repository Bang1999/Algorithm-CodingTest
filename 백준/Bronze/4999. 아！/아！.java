import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] l = new int[2];
        for(int i=0;i<2;i++){
            l[i] = Integer.valueOf(sb.append(br.readLine()).length());
            sb.delete(0, sb.length());
        }
        if(l[0] >= l[1]){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}