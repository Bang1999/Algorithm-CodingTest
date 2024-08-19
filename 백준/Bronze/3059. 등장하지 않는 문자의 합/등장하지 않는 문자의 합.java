import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        
        for(int i=0;i<T;i++){
            int[] alpha = new int[26];
            int sum = 0;
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                alpha[str.charAt(j)-'A']++;
            }
            for(int j=0;j<alpha.length;j++){
                if(alpha[j] == 0){
                    sum += j+'A';
                }
            }
            System.out.println(sum);
        }
    }
}