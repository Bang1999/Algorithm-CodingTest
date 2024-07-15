import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        sc.close();
        int cnt=0;
        l=l.trim();
        
        if(l.length()==0){
            System.out.println(0);
        }else{
            for(int i=0;i<l.length();i++){
            if(l.charAt(i) == ' '){
                cnt++;
            }
        }
            System.out.println(cnt+1);   
        }
    }
}