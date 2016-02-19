package aplz.hackerrank.bots;

import java.util.Scanner;

public class BotSavesPrincess2 {

    static String input = "5\n" +
            "1 2\n" +
            "p----\n" +
            "--m--\n" +
            "-----\n" +
            "-----\n" +
            "-----";

    public static void main(String[] args) {
        Scanner in = new Scanner(input);
        int n, r, c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];

        for (int i = 0; i < n; i++) {
            grid[i] = in.next();
        }
        displayPathtoPrincess(n, r, c, grid);
    }

    private static int[] findPrincess(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j].equalsIgnoreCase("p")) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    private static int[] print_next_move(int bot_x, int bot_y, int[] princess) {
        if (bot_x == princess[0] && bot_y == princess[1]) {
            return new int[]{-1, -1};
        } else if (bot_x > princess[0]) {
            System.out.println("UP");
            bot_x--;
        } else if (bot_y > princess[1]) {
            System.out.println("LEFT");
            bot_y--;
        } else if (bot_x < princess[0]) {
            System.out.println("DOWN");
            bot_x++;
        } else {
            System.out.println("RIGHT");
            bot_y++;
        }
        return new int[]{bot_x, bot_y};
    }


    private static void displayPathtoPrincess(int n, int botRow, int botCol, String[] gridIn) {

        String[][] grid = new String[gridIn.length][];
        for (int i = 0; i < gridIn.length; i++) {
            char[] chars = gridIn[i].toCharArray();
            grid[i] = new String[gridIn.length];
            for (int j = 0; j < chars.length; j++) {
                grid[i][j] = String.valueOf(chars[j]);
            }
        }
        int[] princess = findPrincess(grid);
        // For submission: comment out the while loop.
        while (botCol > -1 && botRow > -1) {
            int[] nextPosition = print_next_move(botRow, botCol, princess);
            botRow = nextPosition[0];
            botCol = nextPosition[1];
        }
    }


}
