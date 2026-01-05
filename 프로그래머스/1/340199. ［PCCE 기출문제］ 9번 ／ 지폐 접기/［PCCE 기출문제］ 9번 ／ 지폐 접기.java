class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(!check(wallet, bill)) {
            bill = half(bill);
            answer++;
        }
        return answer;
    }
    public boolean check(int[] wallet, int[] bill) {
        if(wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            return true;
        }
        if(wallet[1] >= bill[0] && wallet[0] >= bill[1]) {
            return true;
        }
        return false;
    }
    public int[] half(int[] bill) {
        if(bill[0] > bill[1]) {
            bill[0] /= 2;
        } else {
            bill[1] /= 2;
        }
        return bill;
    }
}