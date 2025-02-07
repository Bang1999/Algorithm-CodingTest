class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] a1 = new String[n];
        String[] a2 = new String[n];
        for(int i=0;i<n;i++){
            a1[i] = two(arr1[i], n);
            a2[i] = two(arr2[i], n);
        }
        for(int i=0;i<n;i++){
            answer[i] = "";
            for(int j=0;j<n;j++){
                if(a1[i].charAt(j) == '1' ||a2[i].charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
    public static String two(int a, int n){
        String r = "";
        for(int i=0;i<n;i++){
            r += "" + a%2;
            a /= 2;
        }
        String b = "";
        for(int i=n-1;i>=0;i--){
            b += "" + r.charAt(i);
        }
        return b;
    }
}