import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String str = sc.nextLine();
            int score=0;
            int cnt=1;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == 'O'){
                    score+=cnt;
                    cnt++;
                }else{
                    cnt=1;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}