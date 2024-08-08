import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int cnt = Integer.parseInt(br.readLine());
            int value = 0;
            String name = "";
            for(int j=0;j<cnt;j++){
                String[] tmp = br.readLine().split(" ");
                if(Integer.parseInt(tmp[0]) > value){
                    value=Integer.parseInt(tmp[0]);
                    name = tmp[1];
                }
            }
            System.out.println(name);
        }
    }
}