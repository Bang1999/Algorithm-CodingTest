import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            String str = br.readLine();
            for(int j=0;j<str.length();j++) {
                char a = str.charAt(j);
                if(a == 'y' || a == 'Y') {                    
                    if(a == 'y'){
                        System.out.print("a");
                    } else {
                        System.out.print("A");
                    }
                } else if(a == 'a' || a == 'A') {
                    if(a == 'a'){
                        System.out.print("e");
                    } else {
                        System.out.print("E");
                    }
                } else if(a == 'e' || a == 'E') {
                    if(a == 'e'){
                        System.out.print("i");
                    }else {
                        System.out.print("I");
                    }
                } else if(a == 'i' || a == 'I') {
                    if(a == 'i'){
                        System.out.print("o");
                    } else {
                        System.out.print("O");
                    }
                } else if(a == 'o' || a == 'O') {
                    if(a == 'o'){
                        System.out.print("u");
                    } else {
                        System.out.print("U");
                    }
                } else if(a == 'u' || a == 'U') {
                    if(a == 'u') {
                        System.out.print("y");
                    } else {
                        System.out.print("Y");
                    }
                }else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}