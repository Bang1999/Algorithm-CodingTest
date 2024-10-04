import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(input != null){
            String[] str = input.split(" ");
            for(int i=0;i<str.length;i++){
                if(i == 0){
                    System.out.print(Integer.parseInt(str[i]) * Integer.parseInt(str[i + 1]) + " ");
                }else if(i == str.length-1){
                    System.out.println(Integer.parseInt(str[i]) * Integer.parseInt(str[i - 1]));
                }else {
                    System.out.print(Integer.parseInt(str[i]) * Integer.parseInt(str[i + 1]) * Integer.parseInt(str[i - 1]) + " ");                    
                }   
            }
            input = br.readLine();
        }
    }
}