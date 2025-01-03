class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int a = 0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                a++;
            }
        }
        String[] answer = new String[a];
        a=0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                answer[a] = todo_list[i];
                a++;
            }
        }
        return answer;
    }
}