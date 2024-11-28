class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        long a = 1;
        long b = 0;
        
        for(int i=0;i<num_list.length;i++){
            a *= num_list[i];
            b += num_list[i];
        }
        
        b = b*b;
        if(a > b) {
            answer = 0;
        } else{
            answer = 1;
        }
        return answer;
    }
}