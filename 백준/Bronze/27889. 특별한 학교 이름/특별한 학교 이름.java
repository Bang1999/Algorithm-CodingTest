import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        String[][] a = {{"NLCS", "North London Collegiate School"}, {"BHA", "Branksome Hall Asia"}, {"KIS", "Korea International School"}, {"SJA", "St. Johnsbury Academy"}};
        
        for(int i=0;i<4;i++){
            if(a[i][0].equals(str)){
                System.out.println(a[i][1]);
            }
        }
    }
}