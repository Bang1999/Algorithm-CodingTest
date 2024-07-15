import java.util.Scanner;

public class Main{
    public static void main(String[] args)   {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();
        int[] cnt = new int[26];

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c - 'a' < 0){
                cnt[c-'A']++;
            }else{
                cnt[c-'a']++;
            }

        }

        int maxCnt = 0;
        int max = cnt[0];
        int tmp =0;
        int tmpCnt=0;
        for(int i=1;i<cnt.length;i++){
            if(max<cnt[i]){
                maxCnt=i;
                max=cnt[i];
            }else if(max==cnt[i]){
                tmp=cnt[i];
                tmpCnt=i;
            }
        }
        if(tmp==max && maxCnt != tmpCnt){
            System.out.println("?");
        }else{
            System.out.println((char)(maxCnt+'A'));
        }
    }
}