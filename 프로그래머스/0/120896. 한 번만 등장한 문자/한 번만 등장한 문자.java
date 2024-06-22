class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] alphabet = new int[26];

    for(int i=0;i<s.length();i++){
      alphabet[(int)s.charAt(i)-97]++;
    }
    for(int i=0;i<26;i++){
      if(alphabet[i]==1){
        answer += String.valueOf((char)(i+97));
      }
    }
        return answer;
    }
}