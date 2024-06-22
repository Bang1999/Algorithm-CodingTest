import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);


    int result = sc.nextInt();
    String cal = "";
    cal = sc.next();

    while(!cal.equals("=")){
      int val = sc.nextInt();

      switch (cal){
        case "+":
          result += val;
          break;
        case "-":
          result -= val;
          break;
        case "*":
          result *= val;
          break;
        case "/":
          result /= val;
          break;
      }
      cal = sc.next();
    }

    System.out.println(result);
  }
}