package aplz.hackerrank.algorithms.implementation;


import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for (int testCase = 0; testCase < numberOfTestCases; testCase++) {
            int numberOfCycles = in.nextInt();
            int height = 1;

            for (int i = 0; i < numberOfCycles; i++) {
                if (i % 2 == 0) {
                    height = height * 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}
