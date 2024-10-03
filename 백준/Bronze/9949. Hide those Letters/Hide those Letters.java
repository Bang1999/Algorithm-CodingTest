import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int ans = 1;
        while(!str[0].equals("#")){
            int T = Integer.parseInt(br.readLine());
            System.out.println("Case " + ans++);
            for(int i=0;i<T;i++){
                String l = br.readLine();
                for(int j=0;j<l.length();j++){
                    if(l.toLowerCase().charAt(j) == str[0].charAt(0) || l.toLowerCase().charAt(j) == str[1].charAt(0) || l.toUpperCase().charAt(j) == str[0].charAt(0) || l.toUpperCase().charAt(j) == str[1].charAt(0)){
                        System.out.print("_");
                    }else{
                        System.out.print(l.charAt(j));
                    }
                }
                System.out.println();
            }
            System.out.println();
            str = br.readLine().split(" ");
        }
    }
}