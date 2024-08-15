import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] NM = new int[2];
        int i=0;
        while(st.hasMoreTokens()){
            NM[i++] = Integer.parseInt(st.nextToken());
        }
        String str = "";
        for(int j=0;j<NM[0];j++){
            str += String.valueOf(NM[0]);
        }
        
        if(str.length() > NM[1]){
            System.out.println(str.substring(0, NM[1]));
        }else{
            System.out.println(str);
        }
    }
}