package aplz.hackerrank.algorithms.dynamicprogramming;


import java.util.Scanner;

public class MaximumSubarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        StringBuffer out = new StringBuffer();
        for (int testCase = 0; testCase < numTestCases; testCase++) {
            int dimensions = Integer.parseInt(in.nextLine());
            String[] valuesAsString = in.nextLine().split(" ");
            int[] array = new int[dimensions];
            for (int dim = 0; dim < dimensions; dim++) {
                array[dim] = Integer.parseInt(valuesAsString[dim]);
            }
            int max_ending_here = array[0];
            int max_so_far = array[0];
            int sumAllPositiveValues = 0;
            int maxNegativeValue = Integer.MIN_VALUE;
            boolean allNegative = true;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if (value > 0) {
                    sumAllPositiveValues += value;
                    allNegative = false;
                } else {
                    maxNegativeValue = Math.max(maxNegativeValue, value);
                }
                if (i == 0) {
                    continue;
                }
                max_ending_here = Math.max(value, max_ending_here + value);
                max_so_far = Math.max(max_so_far, max_ending_here);

            }
            if (allNegative) {
                out.append(max_so_far).append(" ").append(maxNegativeValue).append("\n");
            } else {
                out.append(max_so_far).append(" ").append(sumAllPositiveValues).append("\n");
            }
        }
        System.out.print(out.toString().trim());
    }
}
