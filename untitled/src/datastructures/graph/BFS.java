package datastructures.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    private int vertex;

    private LinkedList<Integer> adj[];

    public BFS(int vertex) {
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for (int i = 0; i < vertex; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int w) {
        adj[vertex].add(w);
    }

    // BFS algorithm
    void BFS(int s) {

        boolean visited[] = new boolean[vertex];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS bfs = new BFS(4);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        bfs.BFS(2);
    }
}
