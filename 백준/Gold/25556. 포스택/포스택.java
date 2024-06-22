import java.util.Scanner;
import java.util.Stack;

public class Main{


  public static void main(String[] args){

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack3 = new Stack<Integer>();
    Stack<Integer> stack4 = new Stack<Integer>();

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] arrs = new int[N];

    for(int i=0;i<arrs.length;i++){
      arrs[i] = sc.nextInt();
    }
    sc.close();

    String key = "YES";


    // stack에 넣기
    for(int i=0;i<arrs.length;i++){

      if ((stack1.isEmpty()) || (stack1.peek()<arrs[i])){
        stack1.push(arrs[i]);
      } else if ((stack2.isEmpty()) || (stack2.peek()<arrs[i])){
        stack2.push(arrs[i]);
      } else if ((stack3.isEmpty()) || (stack3.peek()<arrs[i])) {
        stack3.push(arrs[i]);
      } else if ((stack4.isEmpty()) || (stack4.peek()<arrs[i])){
        stack4.push(arrs[i]);
      }else{
        key="NO";
        break;
      }
    }

    System.out.println(key);
  }
}