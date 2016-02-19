package aplz.hackerrank.algorithms.graph;


import java.util.*;

public class EvenTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] components = in.nextLine().split(" ");
        int numVertices = Integer.parseInt(components[0]);
        int numEdges = Integer.parseInt(components[1]);


        Map<Integer, List<Integer>> parents = new LinkedHashMap<Integer, List<Integer>>();
        for (int i = 0; i < numVertices; i++) {
            parents.put(i + 1, new ArrayList<Integer>());
            parents.get(i + 1).add(i + 1);
        }

        for (int edge = 0; edge < numEdges; edge++) {
            String[] edgeAsString = in.nextLine().split(" ");
            int from = Integer.parseInt(edgeAsString[0]);
            int to = Integer.parseInt(edgeAsString[1]);
            parents.get(to).add(from);
        }
        int numCuts = -1;
        for (int i = numVertices; i >= 0; i--) {
            List<Integer> children = parents.get(i);
            if (!parents.containsKey(i)) {
                continue;
            }
            if (children.size() % 2 == 0) {
                numCuts++;
                for (Integer child : parents.keySet()) {
                    parents.get(child).remove((Integer) i);
                }
            }
        }
        System.out.println(numCuts);
    }
}

