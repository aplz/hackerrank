package aplz.hackerrank.java;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCounter = 0;
        while (scanner.hasNext()){
            System.out.println(lineCounter++ +" " + scanner.nextLine());
        }
    }
}
