import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        for(int i=0;i<indices.length;i++){
            answer = my_string;
            my_string = my_string.substring(0, indices[i]-i) + my_string.substring(indices[i]+1-i, my_string.length());
        }
        answer = my_string;
        return answer;
    }
}