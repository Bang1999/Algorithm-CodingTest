import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> a = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                a.push(s.charAt(i));
            }else if(!a.isEmpty()){
                a.pop();
            }else{
                return false;
            }
        }
        if(!a.isEmpty()){
            return false;
        }
        return true;
    }
}