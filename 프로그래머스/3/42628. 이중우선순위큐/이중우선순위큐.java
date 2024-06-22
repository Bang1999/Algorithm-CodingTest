import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    for(int i=0;i<operations.length;i++){
      switch (operations[i].charAt(0)){
        case 'I':
          String num = operations[i].substring(2, operations[i].length());
          minHeap.offer(Integer.parseInt(num));
          maxHeap.offer(Integer.parseInt(num));
          break;
        case 'D':
          if(minHeap.isEmpty()){
            continue;
          }
          if(operations[i].charAt(2)=='-'){
            int val = minHeap.peek();
            minHeap.poll();
            maxHeap.remove(val);
          }else{
            int val = maxHeap.peek();
            maxHeap.poll();
            minHeap.remove(val);
          }
          break;
      }
    }

    if(minHeap.isEmpty()){
      answer[0] = 0;
      answer[1]=0;
    }else{
      answer[1]=minHeap.poll();
      answer[0]=maxHeap.poll();
    }
        return answer;
    }
}