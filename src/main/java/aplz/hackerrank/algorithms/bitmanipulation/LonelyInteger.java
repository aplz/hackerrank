package aplz.hackerrank.algorithms.bitmanipulation;


import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                return a[i];
            }
            if (a[i] == a[i + 1]) {
                i = i + 1;
            } else {
                return a[i];
            }
        }
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = Integer.parseInt(in.nextLine());
        int[] array = new int[arraySize];
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        for (int idx = 0; idx < arraySize; idx++) {
            array[idx] = Integer.parseInt(next_split[idx]);
        }
        int result = lonelyinteger(array);
        System.out.println(result);

    }
}
