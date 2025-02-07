class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int cnt = 0;
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1;i<a;i++){
            cnt += month[i];
        }
        cnt += b;
        switch (cnt%7){
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }
        return answer;
    }
}