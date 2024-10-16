import java.io.*;

public class Main{
public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
        String[] str = br.readLine().split(" ");
        System.out.print("god");
        for(int j=1;j<str.length;j++){
            System.out.print(str[j]);
        }
        System.out.println();
    }
}
}