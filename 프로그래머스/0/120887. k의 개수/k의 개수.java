class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a <= j; a++) {
            String s = String.valueOf(a);
            char t = (char)(k + '0');
            for (int b = 0; b < s.length(); b++) {
                if (s.charAt(b) == t) {
                    answer++;
                }
            }
        }
        return answer;
    }
}