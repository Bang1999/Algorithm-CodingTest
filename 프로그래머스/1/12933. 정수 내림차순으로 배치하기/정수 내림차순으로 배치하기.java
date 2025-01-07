import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = "" + n;
        String[] b = a.split("");
        Arrays.sort(b);
        a = "";
        for(int i=b.length-1;i>=0;i--){
            a += b[i];
        }
        answer = Long.parseLong(a);
        return answer;
    }
}