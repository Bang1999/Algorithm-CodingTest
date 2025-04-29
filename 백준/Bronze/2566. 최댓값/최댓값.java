import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[9][];
        for(int i=0;i<9;i++) {
            arr[i] = br.readLine().split(" ");
        }
        int n = -1;
        int[] ans = new int[2];
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(n < Integer.parseInt(arr[i][j])) {
                    n = Integer.parseInt(arr[i][j]);
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        System.out.println(n);
        System.out.println(ans[0] + " " + ans[1]);
    }
}