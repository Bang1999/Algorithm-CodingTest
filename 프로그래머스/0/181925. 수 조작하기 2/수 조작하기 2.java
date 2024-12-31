class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int n = numLog[0];
        for(int i=1;i<numLog.length;i++){
            if(n+1 == numLog[i]){
                answer += "w";
            }else if(n-1 == numLog[i]){
                answer += "s";
            }else if(n+10 == numLog[i]){
                answer += "d";
            }else if(n-10 == numLog[i]){
                answer += "a";
            }
            n = numLog[i];
        }
        return answer;
    }
}