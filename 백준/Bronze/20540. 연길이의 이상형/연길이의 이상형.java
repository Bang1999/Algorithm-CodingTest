import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        if(str.charAt(0) == 'I'){
            System.out.print('E');
        }else{
            System.out.print('I');
        }
        if(str.charAt(1) == 'S'){
            System.out.print('N');
        }else{
            System.out.print('S');
        }

        if(str.charAt(2) == 'T'){
            System.out.print('F');
        }else{
            System.out.print('T');
        }
        if(str.charAt(3) == 'J'){
            System.out.print('P');
        }else{
            System.out.print('J');
        }
        
    }
}