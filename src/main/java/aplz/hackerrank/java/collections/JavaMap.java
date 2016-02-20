package aplz.hackerrank.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Anja on 20.02.2016.
 */
public class JavaMap {

    public static String sample = "3\n" +
            "uncle sam\n" +
            "99912222\n" +
            "tom\n" +
            "11122222\n" +
            "harry\n" +
            "12299933\n" +
            "uncle sam\n" +
            "uncle tom\n" +
            "harry";

    public static void main(String[] args) {
        Scanner in = new Scanner(sample);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }

    }
}
