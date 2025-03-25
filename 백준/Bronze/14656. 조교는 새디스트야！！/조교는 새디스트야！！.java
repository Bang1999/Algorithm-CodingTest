import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int answer = 0;
        for(int i=0;i<a;i++){
            if(Integer.parseInt(arr[i])!=(i+1)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}