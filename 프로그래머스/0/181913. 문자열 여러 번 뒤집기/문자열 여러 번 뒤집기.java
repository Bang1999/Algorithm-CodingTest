class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i=0;i<queries.length;i++){
            answer = "";
            answer = my_string.substring(0, queries[i][0]);
            for(int j=queries[i][1];j>=queries[i][0];j--){
                answer += "" + my_string.charAt(j);
            }
            answer += my_string.substring(queries[i][1]+1, my_string.length());
            my_string = answer;
        }
        return answer;
    }
}