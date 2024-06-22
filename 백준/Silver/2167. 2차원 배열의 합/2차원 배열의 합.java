import java.util.Scanner;

public class Main {
  public static int Sum(int[][] array, int i, int j, int x, int y){
    int total=0;
    for(int a=i;a<=x;a++){
      for(int b=j;b<=y;b++){
        total+=array[a][b];
      }
    }



    return total;
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] array = new int[N][M];

    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        array[i][j]=sc.nextInt();
      }
    }

    int K = sc.nextInt();

    int[][] pos = new int[K][4];

    for(int i=0;i<K;i++){
      for(int j=0;j<4;j++){
        pos[i][j]=sc.nextInt()-1;
      }
    }
    sc.close();



    for(int i=0;i<K;i++){
      System.out.println(Sum(array, pos[i][0], pos[i][1], pos[i][2], pos[i][3]));
    }
  }
}