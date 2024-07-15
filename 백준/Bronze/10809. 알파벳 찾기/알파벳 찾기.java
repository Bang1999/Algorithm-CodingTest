import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int[] idx = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1
                             , -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
                             , -1, -1, -1, -1, -1, -1};
        
        for(int i=0;i<str.length();i++){
            if(idx[(int)str.charAt(i)-'a'] == -1){
                idx[(int)str.charAt(i)-'a'] = i;
            }
        }
        
        for(int i : idx){
            System.out.print(i + " ");
        }
    }
}