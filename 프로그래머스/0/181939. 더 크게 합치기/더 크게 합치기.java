class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = ""+a+b;
        String B = ""+b+a;
        if(Integer.parseInt(A)>Integer.parseInt(B)){
            answer = Integer.parseInt(A);
        }else{
            answer = Integer.parseInt(B);
        }
        return answer;
    }
}