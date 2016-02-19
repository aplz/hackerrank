package aplz.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();

        for(int a0 = 0; a0 < numberOfTestCases; a0++){
            int number = in.nextInt();
            String numberString = number +"";
            int numEvenlyDivisibleDigits = 0;
            for (int i = 0; i < numberString.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
                if(digit == 0){
                    continue;
                }
                if(number % digit == 0){
                    numEvenlyDivisibleDigits ++;
                }
            }
            System.out.println(numEvenlyDivisibleDigits);
        }
    }
}
