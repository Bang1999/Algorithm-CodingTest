import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s.isEmpty() || s.startsWith("_") || s.endsWith("_") || s.contains("__")) {
            System.out.println("Error!");
            return;
        }
        boolean hasUnderscore = s.contains("_");
        boolean hasUpper = false;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
        }
        if (hasUnderscore && hasUpper) {
            System.out.println("Error!");
            return;
        }
        if (hasUnderscore) {
            for (char c : s.toCharArray()) {
                if (!(Character.isLowerCase(c) || c == '_')) {
                    System.out.println("Error!");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            boolean toUpper = false;
            for (char ch : s.toCharArray()) {
                if (ch == '_') {
                    toUpper = true;
                } else {
                    if (toUpper) {
                        sb.append(Character.toUpperCase(ch));
                        toUpper = false;
                    } else {
                        sb.append(ch);
                    }
                }
            }
            System.out.println(sb.toString());
        }
        else if (hasUpper) {
            if (!Character.isLowerCase(s.charAt(0))) {
                System.out.println("Error!");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    sb.append('_').append(Character.toLowerCase(ch));
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
        else {
            System.out.println(s);
        }
    }
}
