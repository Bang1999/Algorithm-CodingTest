import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[num];
        int a = -100;
        while(true) {
            int sum = 0;
            for(int i=0;i<num;i++) {
                sum += a+i;
            }
            if(sum==total) {
                for(int i=0;i<num;i++) {
                    answer[i] = a+i;
                }
                break;
            }
            a++;
        }
        
        return answer;
    }
}