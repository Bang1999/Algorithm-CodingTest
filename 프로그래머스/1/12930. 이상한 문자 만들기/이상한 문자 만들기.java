class Solution {
    public String solution(String s) {
        String answer = "";
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                c = 0;
                answer += " ";
                continue;
            }
            if(c++ % 2 == 0){
                answer += ("" + s.charAt(i)).toUpperCase();
            } else {
                answer += ("" + s.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}