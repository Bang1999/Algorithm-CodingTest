class Solution {
    public String solution(String s) {
        String answer = ("" + s.charAt(0)).toUpperCase();
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == ' '){
                answer += " ";
            } else if(s.charAt(i-1) == ' '){
                answer += ("" + s.charAt(i)).toUpperCase();
            } else {
                answer += ("" + s.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}