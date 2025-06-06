import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while(n!=1) {
            list.add(n);
            if(n%2==0) {
                n/=2;
            } else {
                n = n*3+1;
            }
        }
        list.add(1);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}