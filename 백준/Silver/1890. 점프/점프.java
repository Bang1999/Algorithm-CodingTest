import java.util.Scanner;

public class Main {
  static int N;
  public static long Jump(long[][] dp, int[][] Map){

    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        int moveCnt = Map[i][j];
        if(i == N-1 && j == N-1){
          return dp[N-1][N-1];
        }
        if(i+moveCnt<N){
          dp[i+moveCnt][j] += dp[i][j];
        }
        if(j+moveCnt<N){
          dp[i][j+moveCnt] += dp[i][j];
        }
      }
    }
    return -1;
  }


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    int[][] map = new int[N][N];

    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        map[i][j]=sc.nextInt();
      }
    }
    sc.close();


    long[][] dp = new long[N][N];
    dp[0][0] = 1;

    System.out.println(Jump(dp, map));
  }
}