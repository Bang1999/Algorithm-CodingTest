import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        boolean ans = true;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1) == '1'){
                if(str.charAt(i) != '2'){
                    ans = false;
                    break;
                }
            }else{
                if(str.charAt(i) != '1'){
                    ans = false;
                    break;
                }
            }
        }
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}