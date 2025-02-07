class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=0;i<number;i++){
            answer += aaaa(i+1, limit, power);
        }
        return answer;
    }
    public static int aaaa(int a, int limit, int power){
        int b = 0;
        for(int i=1;i*i<=a;i++){
            if(i*i == a){
                b++;
            }else if(a%i == 0){
                b+=2;
            }
            if(b > limit){
                return power;
            }
        }
        return b;
    }
}