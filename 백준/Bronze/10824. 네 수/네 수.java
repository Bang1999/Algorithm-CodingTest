import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken() + st.nextToken();
        String num2 = st.nextToken() + st.nextToken();

        System.out.println(Long.valueOf(num1) + Long.valueOf(num2));        
    }
}