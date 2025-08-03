import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sort = new int[emergency.length];
        for(int i=0;i<emergency.length;i++) {
            sort[i] = emergency[i];
        }
        Arrays.sort(sort);
        int[] answer = new int[sort.length];
        for(int i=0;i<sort.length;i++) {
            for(int j=0;j<sort.length;j++) {
                if(emergency[i] == sort[j]) {
                    answer[i] = sort.length - j;
                }
            }
        }
        
        return answer;
    }
}