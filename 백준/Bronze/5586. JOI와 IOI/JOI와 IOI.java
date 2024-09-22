import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i, i+3).equals("JOI")){
                a++;
            }else if(str.substring(i, i+3).equals("IOI")){
                b++;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}