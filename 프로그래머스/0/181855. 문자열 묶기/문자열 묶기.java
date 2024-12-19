import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] a = new int[100000];
        for(int i=0;i<strArr.length;i++){
            a[strArr[i].length()]++;
        }
        Arrays.sort(a);
        answer = a[99999];
        return answer;
    }
}