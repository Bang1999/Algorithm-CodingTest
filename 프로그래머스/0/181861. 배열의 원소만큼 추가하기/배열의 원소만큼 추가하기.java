class Solution {
    public int[] solution(int[] arr) {
        int k = 0;
        for(int i=0;i<arr.length;i++){
            k+=arr[i];
        }
        int[] answer = new int[k];
        k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                answer[k++] = arr[i];
            }
        }
        return answer;
    }
}