package aplz.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
 * the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long
 * integers.
 */
public class MiniMaxSum {

    static String testString = "1 2 3 4 5";

    public static void main(String[] args) {
        Scanner in = new Scanner(testString);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        List<Long> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        // sort the list.
        Collections.sort(list);
        // the minimum sum can now be obtained from the first four values
        List<Long> longs = list.subList(0, 4);
        long minSum = 0L;
        for (Long aLong : longs) {
            minSum += aLong;
        }
        // the maximum sum can now be obtained from the last four values
        longs = list.subList(1, 5);
        long maxSum = 0L;
        for (Long aLong : longs) {
            maxSum += aLong;
        }

        System.out.println(minSum + " " + maxSum);
    }
}
