class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int xSum = 0;
        int numSum = 0;
        
        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                numSum += Integer.parseInt(term);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (xSum > 0) {
            if (xSum == 1) {
                sb.append("x");
            } else {
                sb.append(xSum).append("x");
            }
        }
        
        if (numSum > 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(numSum);
        }
        return sb.toString();
    }
}
