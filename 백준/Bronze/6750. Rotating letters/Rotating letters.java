import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char[] c = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};
        Boolean flag = true;
        for(int i=0;i<str.length();i++){
            if(flag == false){
                break;
            }
            Boolean k = false;
            for(int j=0;j<c.length;j++){
                if(str.charAt(i) == c[j]){
                    k = true;
                    break;
                }
            }
            if(k == false){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}