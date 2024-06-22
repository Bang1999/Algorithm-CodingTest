import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
    Hashtable<String, Integer> ht = new Hashtable<>();
    for(int i=0;i<clothes.length;i++){
      if(!ht.containsKey(clothes[i][1])){
        ht.put(clothes[i][1], 1);
      }else{
        ht.put(clothes[i][1], ht.get(clothes[i][1])+1);
      }

    }
    for(int i=0;i<clothes.length;i++){
      answer *= ht.get(clothes[i][1])+1;
      ht.put(clothes[i][1], 0);
    }
        return answer-1;
    }
}