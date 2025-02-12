import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        
        for (int i = 0; i < s.length(); i++) {
            answer.append(Change(s.charAt(i), skipSet, index)); 
        }
        return answer.toString();
    }
    
    public static char Change(char c, Set<Character> skipSet, int index) {
        int count = 0;
        
        while (count < index) {
            c = (c == 'z') ? 'a' : (char) (c + 1); 
            if (!skipSet.contains(c)) { 
                count++;
            }
        }
        return c;
    }
}
