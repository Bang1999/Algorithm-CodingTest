import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String name : completion) {
            if(map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            }else{
                map.put(name, 1);
            }
        }
        for(String name : participant) {
            if(!map.containsKey(name) || map.get(name) == 0){
                answer = name;
                break;
            }else {
                map.put(name, map.get(name) - 1);
            }
        }
        return answer;
    }
}