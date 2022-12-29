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
            int update = queue.poll();
            for (int vertex = 0; vertex < VERTEX; vertex++) {
                if (visited[vertex] == false && Graph[update][vertex] > 0){
                    queue.add(vertex);
                    p[vertex] = update;
                    visited[vertex] = true;
                }
            }
        }
        return (visited[t] == true);
    }

    //Applying ford-fulkerson algorithm
    private  int fordFulkerson(int graph[][], int s, int t){
        int update, vertex;
        int Graph[][] = new int[VERTEX][VERTEX];

        for (update = 0; update < VERTEX; update++){
            for (vertex = 0 ; vertex < VERTEX; vertex++){
                Graph[update][vertex] = graph[update][vertex];
            }
        }

        int p[] = new int[VERTEX];
        int max_flow = 0;

        while (breathFirstSearch(Graph, s, t, p)) {
            int path_flow = Integer.MAX_VALUE;
            for (vertex = t; vertex != s; vertex = p[vertex]) {
                update = p[vertex];
                path_flow = Math.min(path_flow, Graph[update][vertex]);
            }

            for (vertex = t; vertex != s; vertex = p[vertex]) {
                update = p[vertex];
                Graph[update][vertex] -= path_flow;
                Graph[vertex][update] += path_flow;
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
