import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] nums = new int[N];

    for(int i=0;i<N;i++){
      nums[i] = sc.nextInt();
    }
    sc.close();

    int answer=0;

    for(int i=0;i<nums.length;i++){
      int sum=0;
      for(int j=i;j<nums.length;j++){
        sum+=nums[j];

        if(sum==M){
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}