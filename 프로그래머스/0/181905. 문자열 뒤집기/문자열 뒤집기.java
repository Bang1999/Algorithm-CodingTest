class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        String a = my_string.substring(s, e+1);
        for(int i=a.length()-1;i>=0;i--){
            answer += "" + a.charAt(i);
        }
        answer += my_string.substring(e+1, my_string.length());
        return answer;
    }
}