import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        
        int ans = 0;
        int num = Integer.parseInt(str[0]);

        if(str[1].equals("perfect")){
            ans = num*1000;
        }else if(str[1].equals("great")){
            ans = num*600;
        }else if(str[1].equals("cool")){
            ans = num*400;
        }else if(str[1].equals("bad")){
            ans = num*200;
        }

        System.out.println(ans);
    }
}