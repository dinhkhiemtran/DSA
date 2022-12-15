package datastructures.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private LinkedList<Integer> adjLists[];

    private boolean isVisited[];

    DFS(int vertices){
        adjLists = new LinkedList[vertices];
        isVisited = new boolean[vertices];

        for (int i = 0; i < vertices; i++){
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }

    void DFS(int vertex){
        isVisited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!isVisited[adj]){
                DFS(adj);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        dfs.DFS(2);
    }
}
