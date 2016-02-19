package aplz.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortWithShiftCount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);
    }

    public static void insertionSortPart2(int[] array) {
        int numShifts = 0;
        for (int i = 1; i < array.length; i++) {
            int toSort = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > toSort) {
                array[j] = array[j - 1];
                j = j - 1;
                numShifts++;
            }
            array[j] = toSort;
            printArray(array);
        }
        System.out.println(numShifts);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
