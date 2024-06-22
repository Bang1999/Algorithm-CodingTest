import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] cnt = new int[20];

    for(int i=0;i<N;i++){
      int data=sc.nextInt();
      int idx=0;
      while(data>0){
        int temp = data%2;
        data/=2;
        if(temp==1){
          cnt[idx]++;
        }
        idx++;
      }
    }
    sc.close();

    long answer=0L;
    for(int i=0;i<cnt.length;i++){
      answer += (1L<<i)*cnt[i]*(N-cnt[i]);
    }
    System.out.println(answer);
  }
}