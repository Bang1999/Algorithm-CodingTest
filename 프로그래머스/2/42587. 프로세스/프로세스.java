import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();

    for(int i:priorities){
      queue.add(i);
    }

    int num =9;
    int idx=0;
    while(!queue.isEmpty()){

      if(!queue.contains(num)){
        num--;
      }else{
        if(priorities[idx%priorities.length]==num){
          if(location==idx%priorities.length){
            answer++;
            System.out.println(answer);
            break;
          }
          queue.remove(num);
          answer++;
        }
        idx++;
      }

    }
        return answer;
    }
}