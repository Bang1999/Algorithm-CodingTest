class Solution {
    public int solution(int[] nums) {
        int answer=0;
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int m=j+1;m<nums.length;m++) {
                    int a = nums[i]+nums[j]+nums[m];
                    if(check(a)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean check(int n) {
        for(int i=2;i<n;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}