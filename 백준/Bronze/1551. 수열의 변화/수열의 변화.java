import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int K = Integer.parseInt(a[1]);
        String[] strNum = br.readLine().split(",");
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(strNum[i]);
        }
        
        while(K!=0){
            K--;
            N--;
            for(int i=0;i<N;i++){
                num[i] = num[i+1] - num[i];
            }
        }
        for(int i=0;i<N-1;i++){
            System.out.print(num[i] + ",");
        }
        System.out.println(num[N-1]);
    }
}