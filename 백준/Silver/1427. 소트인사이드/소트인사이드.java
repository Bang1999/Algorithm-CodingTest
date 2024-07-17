import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int[] ans = new int[str.length()];

        for(int i=0;i<str.length();i++){
            ans[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(ans);

        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]);
        }

    }
}