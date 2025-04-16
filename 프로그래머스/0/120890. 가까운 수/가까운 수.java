import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int a = 101;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++) {
            int gap = array[i] - n;
            if(gap < 0) {
                gap = gap*(-1);
            }
            if(gap < a) {
                answer = array[i];
                a = gap;
            }
        }
        return answer;
    }
}