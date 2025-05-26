class Solution {
    public String[] solution(String[] str_list) {
        int a = -1;
        boolean t = false;
        for(int i=0;i<str_list.length;i++) {
            if(str_list[i].equals("l")) {
                a = i;
                t = true;
                break;
            } else if(str_list[i].equals("r")) {
                a = i;
                break;
            }
        }
        if(a == -1) {
            return new String[0];
        }
        String[] answer;
        if(t) {
            answer = new String[a];
            for(int i=0;i<a;i++) {
                answer[i] = str_list[i];
            }
        } else {
            answer = new String[str_list.length-a-1];
            for(int i=a+1;i<str_list.length;i++){
                answer[i-a-1] = str_list[i];
            }
        }
        return answer;
    }
}