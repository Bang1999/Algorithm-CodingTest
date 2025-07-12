import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder fullText = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.contains("E-N-D")) {
                fullText.append(" ");
                fullText.append(line.substring(0, line.indexOf("E-N-D")));
                break;
            }
            fullText.append(" ");
            fullText.append(line);
        }

        Pattern wordPattern = Pattern.compile("[a-zA-Z-]+");
        Matcher matcher = wordPattern.matcher(fullText.toString());

        String longest = "";
        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest.toLowerCase());
    }
}