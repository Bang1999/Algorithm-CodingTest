import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        
        String b = "";
        for(int i=a.length()-1;i>=0;i--){
            b+=String.valueOf(a.charAt(i));
        }
        if(a.equals(b)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}