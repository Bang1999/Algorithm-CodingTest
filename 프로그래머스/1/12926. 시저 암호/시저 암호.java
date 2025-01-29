class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }else{
                answer += "" + convert(s.charAt(i), n);
            }
        }
        return answer;
    }
    
    public static char convert(char c, int n){
        for(int i=0;i<n;i++){
            if(c == 'z'){
                c = 'a';
            }else if(c == 'Z'){
                c = 'A';
            }else{
                c++;
            }
        }
        return c;
    }
}