import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 1 3 2 5 4 5 2 3
        // 1 2 2 3 3 4 5 5
        // 1: 1, 2: 2, 3: 2, 4: 1, 5: 2
        // 2 2 3 3 5 5
        
        Arrays.sort(tangerine);
        
        int[] cnt = new int[tangerine[tangerine.length-1]+1];
        for(int i=0;i<tangerine.length;i++) {
            cnt[tangerine[i]]++;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<cnt.length;i++) {
            list.add(cnt[i]);
        }
        
        Collections.sort(list);
        int a = 0;
        int total = 0;
        for(int i=list.size()-a-1;i>=0;i--) {
            total += list.get(i);
            answer++;
            if(total >= k) {
                break;
            }
        }
        
        return answer;
    }
}