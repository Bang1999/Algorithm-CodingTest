import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<my_string.length();i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9'){
                a.add(my_string.charAt(i) - '0');
            }
        }
        int[] answer = new int[a.size()];
        for(int i=0;i<a.size();i++){
            answer[i] = a.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}