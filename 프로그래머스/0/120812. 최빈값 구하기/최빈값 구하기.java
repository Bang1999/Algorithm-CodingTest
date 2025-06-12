class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[10001];
        for(int i=0;i<array.length;i++) {
            count[array[i]]++;
        }
        boolean flag = false;
        int max = -1;
        for(int i=0;i<count.length;i++) {
            if(count[i] > answer) {
                answer = count[i];
                max = i;
                flag = false;
            } else if(count[i] == answer) {
                flag = true;
            }
        }
        if(flag) {
            return -1;
        }
        return max;
    }
}