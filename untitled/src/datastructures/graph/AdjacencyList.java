package datastructures.graph;

import java.util.ArrayList;

public class AdjacencyList {

    private static final int VERTEX = 5;

    public static void addEdge(ArrayList<ArrayList<Integer>> adjacencyMatrix,
                               int s, int d){
        adjacencyMatrix.get(s).add(d);
        adjacencyMatrix.get(d).add(s);
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            am.add(new ArrayList<Integer>());

        // Add edges
        addEdge(am, 0, 1);
        addEdge(am, 0, 2);
        addEdge(am, 0, 3);
        addEdge(am, 1, 2);

        printGraph(am);
    }

    // Print the graph
    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.print("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }
}
