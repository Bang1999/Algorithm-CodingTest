import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String cal = br.readLine();
        String b = br.readLine();

        if("*".equals(cal)){
            int l = a.length() + b.length()-2;
            System.out.print(1);
            for(int i=0;i<l;i++){
                System.out.print(0);
            }
        }else{
            if(a.length() > b.length()){
                for(int i=0;i<a.length()-b.length();i++){
                    System.out.print(a.charAt(i));
                }
                System.out.print(b);
            }else if(a.length() == b.length()){
                System.out.print(a.charAt(0) - '0' + b.charAt(0) - '0');
                for(int i=0;i<a.length()-1;i++){
                    System.out.print(0);
                }
            }else{
                for(int i=0;i<b.length()-a.length();i++){
                    System.out.print(b.charAt(i));
                }
                System.out.print(a);
            }
        }
        
    }
}