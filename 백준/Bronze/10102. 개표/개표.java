import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        int[] vote = new int[2];
        String str = br.readLine();
        
        for(int i=0;i<V;i++){
            if(str.charAt(i)=='A'){
                vote[0]++;  
            } else{
                vote[1]++;
            }
        }
        if(vote[0]>vote[1]){
            System.out.println('A');
        }else if(vote[0] == vote[1]){
            System.out.println("Tie");
        }else{
            System.out.println('B');
        }
        
    }
}