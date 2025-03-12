class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            int nn = n;
            int a = i;
            while(nn > 0){
                nn -= a++;
            }
            if(nn == 0){
                answer++;
            }
        }
        return answer;
    }
}