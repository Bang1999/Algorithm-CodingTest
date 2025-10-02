class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int cvCnt = 0;
        while(!s.equals("1")) {
            int[] val = confirm(cnt, s);
            s = convert(val[1]);
            cnt = val[0];
            cvCnt++;
        }
        
        int[] answer = {cvCnt, cnt};
        return answer;
    }
    
    public static int[] confirm(int cnt, String s) {
        int[] val = {cnt, 0};
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                val[1]++;
            } else {
                val[0]++;
            }
        }
        return val;
    }
    
    public static String convert(int n) {
        String s = "";
        while(n != 0) {
            if(n%2 == 1) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            n/=2;
        }
        return s;
    }
}