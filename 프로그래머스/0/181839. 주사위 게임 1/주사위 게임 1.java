class Solution {
    public int solution(int a, int b) {
        if(a%2==1 && b%2==1) {
            return a*a+b*b;
        } else if(a%2==1 || b%2==1) {
            return 2*a+2*b;
        } else {
            if(a > b) {
                return a-b;
            } else {
                return b-a;
            }
        }
    }
}