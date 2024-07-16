import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int cnt=0;
        String[] croa = new String[]{"c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int idx=0;
        while(idx < s.length()){
            boolean isTrue = true;
            if(idx <= s.length()-2){
                for(int i=0;i<croa.length;i++){
                    if(croa[i].equals(s.substring(idx, idx+croa[i].length()))){
                        cnt++;
                        idx+=croa[i].length();
                        isTrue = false;
                        break;
                    }
                }
            }
            if(idx <= s.length()-3){
                if("dz=".equals(s.substring(idx, idx+3))){
                    cnt++;
                    idx+=3;
                    isTrue = false;
                }
            }
            if(isTrue){
                cnt++;
                idx++;
            }

        }
        System.out.println(cnt);

    }
}