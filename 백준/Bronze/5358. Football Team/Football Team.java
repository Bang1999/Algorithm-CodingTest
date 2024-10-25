import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(str != null){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == 'i'){
                    System.out.print("e");
                }else if(str.charAt(i) == 'e'){
                    System.out.print("i");
                }else if(str.charAt(i) == 'I'){
                    System.out.print("E");
                }else if(str.charAt(i) == 'E'){
                    System.out.print("I");
                }else{
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
            str = br.readLine();
        }
    }
}