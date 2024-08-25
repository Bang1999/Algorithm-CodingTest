import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        String[] num = br.readLine().split(" ");
        for(int i=0;i<num[0].length();i++){
            if(num[0].charAt(i) == '6'){
                num[0] = num[0].substring(0, i) + "5" + num[0].substring(i+1, num[0].length());
                // num[0].charAt(i) = '5';
            }
        }
        for(int i=0;i<num[1].length();i++){
            if(num[1].charAt(i) == '6'){
                num[1] = num[1].substring(0, i) + "5" + num[1].substring(i+1, num[1].length());
            }
        }
        ans = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
        System.out.print(ans + " ");
        for(int i=0;i<num[0].length();i++){
            if(num[0].charAt(i) == '5'){
                num[0] = num[0].substring(0, i) + "6" + num[0].substring(i+1, num[0].length());
            }
        }
        for(int i=0;i<num[1].length();i++){
            if(num[1].charAt(i) == '5'){
                num[1] = num[1].substring(0, i) + "6" + num[1].substring(i+1, num[1].length());
            }
        }
        ans = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
        System.out.print(ans);

       
    }
}