class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 1;
        while(i*i < n){
            i++;
        }
        if(i*i == n){
            return (i+1)*(i+1);
        } else {
            return -1;
        }
    }
}