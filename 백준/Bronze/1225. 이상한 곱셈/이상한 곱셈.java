import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        long sum=0;
        for(int i=0;i<str[0].length();i++){
            for(int j=0;j<str[1].length();j++){
                sum += (str[0].charAt(i)-'0')*(str[1].charAt(j)-'0');
            }
        }
        System.out.println(sum);
        
    }
}