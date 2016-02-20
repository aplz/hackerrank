package aplz.hackerrank.java.collections;

import java.util.Scanner;

/**
 * Created by Anja on 20.02.2016.
 */
public class Java1DArrayEasy {


    public static String sample = "5\n" +
            "1 -2 4 -5 1";
    public static void main(String[] args) {
        Scanner sc = new Scanner(sample);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int numNegativeSubarrays = 0;
        for (int i = 0; i < array.length; i++) {
            double sum = array[i];
            if(sum < 0){
                numNegativeSubarrays ++;
            }
            for (int j = i+1; j < array.length; j++) {
                sum += array[j];
                if(sum < 0){
                    numNegativeSubarrays ++;
                }
            }
        }
        System.out.println(numNegativeSubarrays);
    }
}
