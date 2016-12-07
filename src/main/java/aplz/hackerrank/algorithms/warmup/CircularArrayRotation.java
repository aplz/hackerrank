package aplz.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotation {

    static String input = "3 4 3 \n " +
            "1 2 3\n 0 1 2";

    public static void main(String[] args) {
        Scanner in = new Scanner(input);
        int n = in.nextInt(); // dimension of array
        int k = in.nextInt(); // number of rotations
        int q = in.nextInt(); // number of queries
        int[] a = new int[n];
        // fill array
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        if (k > n) {
            k = k % n;
        }
        // no need to rotate if k=n
        if (k != n) {
            int[] moveToFront = Arrays.copyOfRange(a, n- k, n);
            int[] moveToBack = Arrays.copyOfRange(a, 0,n- k);
            System.arraycopy(moveToFront, 0, a, 0, moveToFront.length);
            System.arraycopy(moveToBack, 0, a, k, moveToBack.length);
        }

        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt(); // index of the array element to print
            System.out.println(a[m]);
        }
    }
}
