import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 종류 개수
        int k = sc.nextInt(); // 만들고자 하는 금액

        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        
        sc.close();


        int idx = n-1;
        int answer =0;
        


        while(k!=0){
            answer += k/coin[idx];
            k -= (k/coin[idx])*coin[idx];
            idx--;
        }

        System.out.println(answer);
    }
}