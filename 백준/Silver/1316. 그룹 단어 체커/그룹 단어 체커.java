import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        int cnt=0;
        for(int i=0;i<T;i++){
            String str = sc.nextLine();
            boolean[] alpha = new boolean[26];
            char tmp = str.charAt(0);
            alpha[str.charAt(0)-'a'] = true;
            for(int j=0;j<str.length();j++){
                // 전 것과 같으면
                if(tmp == str.charAt(j)){
                    continue;
                    // 전것과 다르면
                }else{
                    tmp=str.charAt(j);
                    // 이미 있었던거라면
                    if(alpha[str.charAt(j)-'a']){
                        cnt--;
                        break;
                        // 이전에 없던것
                    }else{
                        alpha[str.charAt(j)-'a']=true;
                    }

                }
            }
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}