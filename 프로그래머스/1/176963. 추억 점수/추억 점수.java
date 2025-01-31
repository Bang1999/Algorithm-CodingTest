class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = 0;
            for(int j=0;j<photo[i].length;j++){
                for(int n = 0;n<name.length;n++){
                    if(name[n].equals(photo[i][j])){
                        answer[i] += yearning[n];
                        break;
                    }
                }
            }
        }
        return answer;
    }
}