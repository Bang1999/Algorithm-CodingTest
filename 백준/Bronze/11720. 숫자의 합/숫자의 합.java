import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String l = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<cnt;i++){
            sum += l.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}