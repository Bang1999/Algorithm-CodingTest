import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                System.out.print(4);
            }else if(str.charAt(i) == 'e'){
                System.out.print(3);
            }else if(str.charAt(i) == 'i'){
                System.out.print(1);
            }else if(str.charAt(i) == 'o'){
                System.out.print(0);
            }else if(str.charAt(i) == 's'){
                System.out.print(5);
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}