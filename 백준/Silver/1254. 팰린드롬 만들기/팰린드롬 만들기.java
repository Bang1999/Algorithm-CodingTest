import java.util.Scanner;

public class Main {

  public static boolean Palindrom(String k){
    boolean palindrom = true;

    for(int i=0; i<k.length()/2;i++){
      if(k.charAt(i)!=k.charAt(k.length()-i-1)){
        return false;
      }
    }

    return palindrom;
  }

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    sc.close();

    int answer = s.length();
    boolean key=true;
    for(int i=0;i<s.length()-1;i++){

      key = Palindrom(s.substring(i));

      if(key==true){
        answer+=i;
        break;
      }
    }
    if(key==false){
      answer+=s.length()-1;
    }



    System.out.println(answer);



  }
}