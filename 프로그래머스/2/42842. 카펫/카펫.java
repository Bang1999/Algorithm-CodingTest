class Solution {
    public int[] solution(int brown, int yellow) {
        int a = 3;
        int b = 0;
        boolean w = true;
        while(w){
            if((yellow+brown)%a == 0){
                b = (yellow+brown)/a;
                if((a-2)*(b-2)==yellow){
                    w = false;
                }else{
                    a++;
                }
            }else{
                a++;
            }
        }
        return new int[]{b, a};
    }
}