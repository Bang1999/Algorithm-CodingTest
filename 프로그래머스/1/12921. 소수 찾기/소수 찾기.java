import java.util.*;

class Solution {
    
    private static List<Integer> a = new ArrayList<>();
    
    public int solution(int n) {
        int answer = 0;
        if(n >= 2){
            a.add(2);
            answer++;
        }
        for(int i=3;i<=n;i+=2){
            if(find(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public static boolean find(int n){
        int sqrt = (int) Math.sqrt(n);
        for(int i=0;i<a.size();i++){
            if(a.get(i) > sqrt){
                break;
            }
            if(n % a.get(i) == 0){
                return false; 
            }
        }
        a.add(n);
        return true;
    }
}