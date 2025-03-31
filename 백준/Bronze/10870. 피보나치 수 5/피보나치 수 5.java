import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = 1;
        int n2 = 1;
        int nn = 1;
        if(n == 0) {
            System.out.println(0);
            return;
        }else if(n == 1){
            System.out.println(1);
            return;
        }
        n -= 2;
        while(n != 0){
            nn = n1 + n2;
            n1 = n2;
            n2 = nn;
            n--;
        }
        System.out.println(nn);
    }
}