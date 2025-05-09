import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        
        int a = Integer.parseInt(arr1[0]);
        int b = Integer.parseInt(arr1[1]);
        int c = Integer.parseInt(arr2[0]);
        int d = Integer.parseInt(arr2[1]);
        
        int u = a*d + c*b;
        int dd = b*d;
        for(int i=2;i<=u;i++) {
            if(dd%i == 0 && u%i == 0) {
                u/=i;
                dd/=i;
                i--;
            }
        }
        System.out.println(u + " " + dd);
    }
}