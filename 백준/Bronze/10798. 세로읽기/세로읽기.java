import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int l = 0;
        for(int i=0;i<5;i++){
            str[i] = br.readLine();
            if(str[i].length() > l){
                l = str[i].length();
            }
        }

        for(int i=0;i<l;i++){
            for(int j=0;j<5;j++){
                if(str[j].length()>i){
                    System.out.print(str[j].charAt(i));
                }
            }
        }              
    }
}