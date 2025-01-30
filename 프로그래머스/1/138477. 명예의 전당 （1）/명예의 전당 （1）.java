import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> m = new ArrayList<>();
        answer[0] = score[0];
        m.add(score[0]);
        for(int i=1;i<score.length;i++){
            if(m.size() < k){
                m.add(score[i]);
            }else{
                if(m.get(0) < score[i]){
                    m.remove(m.get(0));
                    m.add(score[i]);
                }
            }
            Collections.sort(m);
            answer[i] = m.get(0);
        }
        return answer;
    }
}