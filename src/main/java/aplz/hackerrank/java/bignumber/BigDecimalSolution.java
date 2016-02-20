package aplz.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;


public class BigDecimalSolution {

    public static String sample = "9\n" +
            "-100\n" +
            "50\n" +
            "0\n" +
            "56.6\n" +
            "90\n" +
            "0.12\n" +
            ".12\n" +
            "02.34\n" +
            "000.000";

    public static void main(String[] args) {

        //Input
        Scanner sc = new Scanner(sample);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Write your code here
        for (int i = 1; i < s.length; i++) {
            String toSort = s[i];
            int j = i;
            while (j > 0 && new BigDecimal(s[j - 1]).compareTo(new BigDecimal(toSort)) == -1) {
                s[j] = s[j - 1];
                j = j - 1;
            }
            s[j] = toSort;
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
