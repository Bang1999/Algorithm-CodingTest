import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

    int[] date = new int[progresses.length];
    List<Integer> answerList = new ArrayList<>();

    for(int i=0;i<progresses.length;i++){

      date[i] = (int)Math.ceil((double)(100-progresses[i])/speeds[i]);

      if(!queue.isEmpty() && queue.peek()<date[i]){
          answerList.add(queue.size());
          queue.clear();
      }
      queue.add(date[i]);
    }
    answerList.add(queue.size());
    int[] answer = new int[answerList.size()];

    for(int i=0;i<answer.length;i++){
      answer[i] = answerList.get(i);
    }
        return answer;
    }
}