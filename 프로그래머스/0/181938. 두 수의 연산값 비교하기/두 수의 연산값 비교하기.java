class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String k = "" + a + b;
        if(Integer.parseInt(k) > 2*a*b){
            answer = Integer.parseInt(k);
        } else {
            answer = 2*a*b;
        }
        return answer;
    }
}