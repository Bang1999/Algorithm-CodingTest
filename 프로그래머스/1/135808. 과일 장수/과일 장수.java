import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int n = score.length / m;
        for(int j=score.length-m;j>=score.length-n*m;j=j-m){
            answer += score[j]*m;
        }

        return answer;
    }
}