package aplz.hackerrank.ai.statistics;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        Arrays.sort(ar);
        double mean = mean(ar);
        System.out.printf(Locale.ENGLISH, "%.1f\n", mean);
        System.out.printf(Locale.ENGLISH, "%.1f\n", median(ar));
        System.out.println(mode(ar));
        double std = std(ar, mean);
        System.out.printf(Locale.ENGLISH, "%.1f\n", std);
        double error = std / Math.sqrt(ar.length);
        double lo = mean - 1.96 * error;
        double hi = mean + 1.96 * error;
        System.out.printf(Locale.ENGLISH, "%.1f %.1f", lo, hi);
    }

    public static double std(int[] m, double mean) {
        double sd = 0;
        for (int i = 0; i < m.length; i++) {
            sd += Math.pow(m[i] - mean, 2);
        }
        return Math.sqrt(sd / (m.length));
    }

    public static double mean(int[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public static double median(int[] m) {
        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2.0;
        }
    }

    public static int mode(int a[]) {
        int maxValue = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
