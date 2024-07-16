import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[] str = new String[T];
        for(int i=0;i<T;i++){
            str[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(str);
        String a = "";
        for(int i=1;i<=50;i++){
            for(int j=0;j<str.length;j++){
                if(str[j].length() == i && !a.equals(str[j])){
                    a = str[j];
                    System.out.println(a);
                }
            }
        }
    }
}