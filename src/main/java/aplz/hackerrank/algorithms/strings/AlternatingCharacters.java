package aplz.hackerrank.algorithms.strings;

import java.util.Scanner;


public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            String string = scanner.nextLine();
            StringBuffer result = new StringBuffer(string.substring(0, 1));
            for (int j = 1; j < string.length(); j++) {
                if (string.charAt(j - 1) != string.charAt(j)) {
                    result.append(string.charAt(j));
                }
            }
            System.out.println(string.length() - result.toString().length());
        }
    }
}
