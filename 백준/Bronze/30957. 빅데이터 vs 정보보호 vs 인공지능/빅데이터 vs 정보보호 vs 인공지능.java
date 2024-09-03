import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] cnt = {0, 0, 0};
        String str = br.readLine();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'B'){
                cnt[0]++;
            }
            if(str.charAt(i) == 'S'){
                cnt[1]++;
            }
            if(str.charAt(i) == 'A'){
                cnt[2]++;
            }
        }
        int a =0;
        for(int i=0;i<3;i++){
            if(cnt[i]>a){
                a=cnt[i];
            }
        }
        
        if(cnt[0] == cnt[1] && cnt[1] == cnt[2]){
            System.out.println("SCU");
        }else{
            for(int i=0;i<3;i++){
            if(cnt[i] == a && i==0){
                System.out.print('B');
            }
            if(cnt[i] == a && i==1){
                System.out.print('S');
            }
            if(cnt[i] == a && i==2){
                System.out.print('A');
            }
        }
        }
    }
}