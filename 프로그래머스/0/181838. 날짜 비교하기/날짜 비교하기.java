class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String a = "" + date1[0] + date1[1] + date1[2];
        String b = "" + date2[0] + date2[1] + date2[2];
        
        if(Integer.parseInt(a) < Integer.parseInt(b)){
            return 1;
        }
        return answer;
    }
}