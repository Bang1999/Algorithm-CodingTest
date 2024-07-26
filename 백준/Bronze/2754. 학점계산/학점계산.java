import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        double num=0.0;
        switch(score){
            case "A+": num=4.3; break;
            case "A0": num=4.0; break;
            case "A-": num=3.7; break;
            case "B+": num=3.3; break;
            case "B0": num=3.0; break;
            case "B-": num=2.7; break;
            case "C+": num=2.3; break;
            case "C0": num=2.0; break;
            case "C-": num=1.7; break;
            case "D+": num=1.3; break;
            case "D0": num=1.0; break;
            case "D-": num=0.7; break;
            case "F": num=0.0; break;
        }
        System.out.println(num);
        br.close();
    }
}