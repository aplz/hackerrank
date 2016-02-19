package aplz.hackerrank.ai.bots;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BotCleanLarge {

    static String input = "0 0\n" +
            "5 6\n" +
            "b---d-\n" +
            "-d--d-\n" +
            "--dd--\n" +
            "--d---\n" +
            "----d-";
    public static void main(String[] args) {
        // use System.in in active setting.
        Scanner in = new Scanner(input);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        next_move(pos[0], pos[1], dim[0], dim[1], board);
    }


    private static List<int[]> dirts;
    private static int selected_dirt_idx = -1;

    private static void findAllDirts(String[][] grid) {
        dirts = new ArrayList<int[]>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].equalsIgnoreCase("d")) {
                    dirts.add(new int[]{i, j});
                }
            }
        }
    }

    private static void find_closest_dirt(int bot_x, int bot_y) {
        int min_dist = 9;
        int min_idx = 0;
        for (int i = 0; i < dirts.size(); i++) {
            int[] dirt = dirts.get(i);

            int dist_x = bot_x > dirt[0] ? bot_x - dirt[0] : dirt[0] - bot_x;
            int dist_y = bot_y > dirt[1] ? bot_y - dirt[1] : dirt[1] - bot_y;
            int dist = dist_x + dist_y;
            if (dist < min_dist) {
                min_idx = i;
                min_dist = dist;
            }
        }
        selected_dirt_idx = min_idx;
    }


    private static void clean() {
        dirts.remove(selected_dirt_idx);
        selected_dirt_idx = -1;
    }

    private static int[] print_next_move(int bot_x, int bot_y) {
        int dirt_x = dirts.get(selected_dirt_idx)[0];
        int dirt_y = dirts.get(selected_dirt_idx)[1];

        if (bot_x == dirt_x && bot_y == dirt_y) {
            clean();
            System.out.println("CLEAN");
        } else if (bot_x > dirt_x) {
            System.out.println("UP");
            bot_x--;
        } else if (bot_y > dirt_y) {
            System.out.println("LEFT");
            bot_y--;
        } else if (bot_x < dirt_x) {
            System.out.println("DOWN");
            bot_x++;
        } else {
            System.out.println("RIGHT");
            bot_y++;
        }
        return new int[]{bot_x, bot_y};
    }


    private static void next_move(int botRow, int botCol, int height, int width, String[] gridIn) {

        String[][] grid = new String[height][];
        for (int i = 0; i < height; i++) {
            char[] chars = gridIn[i].toCharArray();
            grid[i] = new String[width];
            for (int j = 0; j < chars.length; j++) {
                grid[i][j] = String.valueOf(chars[j]);
            }
        }
        findAllDirts(grid);
        // For submission: comment out the while loop.
        while (dirts.size() > 0) {
            find_closest_dirt(botRow, botCol);
            int[] nextPosition = print_next_move(botRow, botCol);
            botRow = nextPosition[0];
            botCol = nextPosition[1];
        }
    }
}
