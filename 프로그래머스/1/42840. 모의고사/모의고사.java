class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int A = 0;
        int B = 0;
        int C = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i] == a[i%a.length]){
                A++;
            }
            if(answers[i] == b[i%b.length]){
                B++;
            }
            if(answers[i] == c[i%c.length]){
                C++;
            }
        }
        if(A > B && A > C){
            return new int[]{1};
        }
        if(B > A && B > C){
            return new int[]{2};
        }
        if(C > A && C > B){
            return new int[]{3};
        }
        if(A == B && B > C){
            return new int[]{1, 2};
        }
        if(A == C && C > B){
            return new int[]{1, 3};
        }
        if(B == C && C > A){
            return new int[]{2, 3};
        }
        if(A == B && B == C){
            return new int[]{1, 2, 3};
        }
        return answer;
    }
}