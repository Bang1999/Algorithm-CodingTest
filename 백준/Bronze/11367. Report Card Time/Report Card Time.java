import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            String grade = getLetterGrade(score);
            System.out.println(name + " " + grade);
        }
    }

    private static String getLetterGrade(int score) {
        if (score >= 97 && score <= 100) return "A+";
        else if (score >= 90) return "A";
        else if (score >= 87) return "B+";
        else if (score >= 80) return "B";
        else if (score >= 77) return "C+";
        else if (score >= 70) return "C";
        else if (score >= 67) return "D+";
        else if (score >= 60) return "D";
        else return "F";
    }
}
