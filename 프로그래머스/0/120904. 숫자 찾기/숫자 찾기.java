class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String a = "" + num;
        for(int i=0;i<a.length();i++){
            if((a.charAt(i)+"").equals(k+"")){
                return i+1;
            }
        }
        return answer;
    }
}