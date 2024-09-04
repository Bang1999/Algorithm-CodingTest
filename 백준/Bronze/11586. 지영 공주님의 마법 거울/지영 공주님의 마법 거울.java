import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        char[][] m = new char[N][N];
        
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                m[i][j] = str.charAt(j);
            }
        }
        
        int T = Integer.parseInt(br.readLine());
        if(T == 1){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
        }else if(T == 2){
            for(int i=0;i<N;i++){
                for(int j=N-1;j>=0;j--){
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
        }else{
            for(int i=N-1;i>=0;i--){
                for(int j=0;j<N;j++){
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
        }
    }
}