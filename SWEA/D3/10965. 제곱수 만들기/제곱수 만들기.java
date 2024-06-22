import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = findMinMultiplier(A);
            System.out.println("#" + test_case + " " + B);
        }
        sc.close();
    }

    public static int findMinMultiplier(int A) {
        int B = 1;
        for (int factor = 2; factor * factor <= A; factor++) {
            int count = 0;
            while (A % factor == 0) {
                A /= factor;
                count++;
            }
            if (count % 2 != 0) {
                B *= factor;
            }
        }
        if (A > 1) {
            B *= A;
        }
        return B;
    }
}
