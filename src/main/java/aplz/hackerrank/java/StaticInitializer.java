package aplz.hackerrank.java;

import java.util.Scanner;

public class StaticInitializer {

    public static boolean flag = false;
    public static int B;
    public static int H;

    static {
        try {
            Scanner scanner = new Scanner(System.in);
            B = Integer.parseInt(scanner.nextLine());
            H = Integer.parseInt(scanner.nextLine());
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main


}
