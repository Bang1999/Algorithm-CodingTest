class Solution {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        for(int i=a.length()-1;i>=0;i--){
            answer[a.length() - 1 - i] = a.charAt(i) - '0';
        }
        return answer;
    }
}