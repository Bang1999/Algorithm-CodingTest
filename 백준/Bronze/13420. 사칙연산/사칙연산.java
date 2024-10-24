import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        long ans = 0;
        for(int i=0;i<T;i++){
            String[] abc = br.readLine().split(" ");
            long a = Long.parseLong(abc[0]);
            long b = Long.parseLong(abc[2]);
            
            switch(abc[1]){
                case "+":
                    ans = a + b;
                    break;
                case "-":
                    ans = a - b;
                    break;
                case "*":
                    ans = a * b;
                    break;
                case "/":
                    ans = a / b;
                    break;
            }
            if(Long.parseLong(abc[4]) == ans){
                System.out.println("correct");
            }else{
                System.out.println("wrong answer");
            }
        }
        
    }
}