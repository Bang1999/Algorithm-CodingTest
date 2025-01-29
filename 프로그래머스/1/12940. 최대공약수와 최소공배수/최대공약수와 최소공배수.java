class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 1;  // 최대공약수
        int b = 1;  // 최대공배수
        int c;
        while(true) {
            c = gcd(n, m);
            if(c == -1){
                break;
            }
            n /= c;
            m /= c;
            a *= c;
            b *= c;
        }
        b *= n;
        b *= m;
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
    
    public static int gcd(int a, int b){
        int sm;
        if(a < b){
            sm = a;
        }else{
            sm = b;
        }
        for(int i=2;i<=sm;i++){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return -1;
    }
}