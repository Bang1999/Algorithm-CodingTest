class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = find(n);
        String b = "";
        while(a != 0){
            b += "" + n/a;
            n %= a;
            a /= 3;
        }
        String c = "";
        for(int i=b.length()-1;i>=0;i--){
            c += "" + b.charAt(i);
        }
        a = 1;
        for(int i=c.length() -1;i>=0;i--){
            answer += a*Integer.parseInt("" + c.charAt(i));
            a *= 3;
        }
        return answer;
    }
    
    public static int find(int a){
        int c = 1;
        while(a/3 != 0){
            a /= 3;
            c *= 3;
        }
        return c;
    }
}