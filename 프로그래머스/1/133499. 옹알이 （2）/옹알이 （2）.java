import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] c = {"aya", "ye", "woo", "ma"};
        String[] d = {"1", "2", "3", "4"};
        for(int i=0;i<babbling.length;i++){
            for(int j=0;j<4;j++){
                babbling[i] = babbling[i].replace(c[j], d[j]);
            }
            if(check(babbling[i])){
                answer++;
            }
        }
        return answer;
    }
    public static boolean check(String a){
        if(a.charAt(0) >= 'a'){
            return false;
        }
        for(int i=1;i<a.length();i++){
            if(a.charAt(i) >= 'a'){
                return false;
            }
            if(a.charAt(i) == a.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}