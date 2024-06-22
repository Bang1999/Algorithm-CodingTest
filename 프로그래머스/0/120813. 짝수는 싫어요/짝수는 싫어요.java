class Solution {
    public int[] solution(int n) {
        int len;
        if(n%2 == 0){
            len=n/2;
        }else{
            len=n/2+1;
        }
        int[] answer = new int[len];
        for(int i=0;i<len;i++){
                answer[i] = (i)*2+1;
            }
        
        return answer;
    }
}