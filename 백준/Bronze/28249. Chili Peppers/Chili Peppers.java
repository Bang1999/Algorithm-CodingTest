import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int T = Integer.parseInt(br.readLine());
        String[] a = {"Poblano", "Mirasol", "Serrano", "Cayenne", "Thai", "Habanero"};
        int[] b = {1500, 6000, 15500, 40000, 75000, 125000};
        int ans = 0;
        for(int i=0;i<T;i++){
            String str = br.readLine();
            for(int j=0;j<6;j++){
                if(str.equals(a[j])){
                    ans += b[j];
                    continue;
                }
            }
        }
        System.out.println(ans);
    }    
}