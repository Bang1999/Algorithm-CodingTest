import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N+1];
        double[] fail2 = new double[N+1];
        int[] cnt = new int[N+2];
        boolean[] used = new boolean[N+1];
        int sum = stages.length;
        
        // 스테이지에 머무는 사용자 수
        for(int i=0;i<stages.length;i++) {
            cnt[stages[i]]++;
        }
        
        // 실패율
        for(int i=1;i<N+1;i++) {
            if(sum > 0) {
                fail[i] = (double) cnt[i]/sum;
            }
            sum -= cnt[i];
        }
        
        for(int i=1;i<N+1;i++) {
            fail2[i] = fail[i];
        }
        
        // 실패율에 따른 정렬 후 정답
        Arrays.sort(fail2);
        int k = 0;
        for(int i=fail2.length-1;i>0;i--) {
            for(int j=1;j<fail.length;j++){
                if(!used[j] && ("" + fail2[i]).equals("" + fail[j])) {
                    answer[k++] = j;
                    used[j] = true;
                    break;
                }
                
            }
        }
        return answer;
    }
}