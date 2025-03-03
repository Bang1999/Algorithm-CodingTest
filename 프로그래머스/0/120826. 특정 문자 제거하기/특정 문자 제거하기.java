class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] a = my_string.split(letter);
        for(int i=0;i<a.length;i++){
            answer += "" + a[i];
        }
        return answer;
    }
}