class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String y = "" + x;
        int a = 0;
        for(int i=0;i<y.length();i++){
            a += Integer.parseInt("" + y.charAt(i));
        }
        if(x % a != 0){
            return false;
        }
        return answer;
    }
}