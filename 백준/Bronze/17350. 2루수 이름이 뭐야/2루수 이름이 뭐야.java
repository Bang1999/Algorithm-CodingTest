import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean tf = false;
        for(int i=0;i<T;i++){
            String str = br.readLine();
            if("anj".equals(str)){
                tf=true;
                break;
            }
        }
        if(tf){
            System.out.println("뭐야;");
        }else{
            System.out.println("뭐야?");
        }
    }
}