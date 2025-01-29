import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int i=0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
        }
        int a = sizes[0][0];
        int b = sizes[0][1];
        for(int i=1;i<sizes.length;i++){
            if(sizes[i][0] > a){
                a = sizes[i][0];
            }
            if(sizes[i][1] > b){
                b = sizes[i][1];
            }
        }
        return a*b;
    }
}