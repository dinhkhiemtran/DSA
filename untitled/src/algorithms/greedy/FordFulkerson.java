package algorithms.greedy;

import java.util.LinkedList;

public class FordFulkerson {

    private static final int VERTEX = 6;

    private boolean breathFirstSearch(int Graph[][], int s, int t , int p[]){
        boolean visited[] = new boolean[VERTEX];
        for (int i = 0; i < VERTEX; ++i){
            visited[i] = false;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        p[s] = -1;

        while (queue.size() != 0) {
            int u = queue.poll();
            for (int v = 0; v < VERTEX; v++) {
                if (visited[v] == false && Graph[u][v] > 0){
                    queue.add(v);
                    p[v] = u;
                    visited[v] = true;
                }
            }
        }
        return (visited[t] == true);
    }

    //Applying ford-fulkerson algorithm
    private  int fordFulkerson(int graph[][], int s, int t){
        int u, v;
        int Graph[][] = new int[VERTEX][VERTEX];

        for (u = 0; u < VERTEX; u++){
            for (v = 0 ; v < VERTEX; v++){
                Graph[u][v] = graph[u][v];
            }
        }

        int p[] = new int[VERTEX];
        int max_flow = 0;

        while (breathFirstSearch(Graph, s, t, p)) {
            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = p[v]) {
                u = p[v];
                path_flow = Math.min(path_flow, Graph[u][v]);
            }

            for (v = t; v != s; v = p[v]) {
                u = p[v];
                Graph[u][v] -= path_flow;
                Graph[v][u] += path_flow;
            }

            // Adding the path flows
            max_flow += path_flow;
        }

        return max_flow;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 8, 0, 0, 3, 0 }, { 0, 0, 9, 0, 0, 0 }, { 0, 0, 0, 0, 7, 2 },
                { 0, 0, 0, 0, 0, 5 }, { 0, 0, 7, 4, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
        FordFulkerson m = new FordFulkerson();

        System.out.println("Max Flow: " + m.fordFulkerson(graph, 0, 5));
    }
}
