package aplz.hackerrank.algorithms.strings;

import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        for (int _a_i = 0; _a_i < numTestCases; _a_i++) {
            String s = in.nextLine();
            String reverse = new StringBuilder(s).reverse().toString();
            boolean isFunny = true;
            for (int i = 1; i < s.length() - 1; i++) {
                if (!(Math.abs(s.charAt(i) - s.charAt(i - 1)) == Math.abs(reverse.charAt(i) - reverse.charAt(i - 1)))) {
                    isFunny = false;
                    break;
                }
            }
            if (isFunny) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
}
