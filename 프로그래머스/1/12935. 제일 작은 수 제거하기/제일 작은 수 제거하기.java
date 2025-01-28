class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        // 가장 작은 것
        int a = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < a){
                a = arr[i];
            }
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                continue;
            }
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}