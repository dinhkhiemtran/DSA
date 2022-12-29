package algorithms.greedy;

public class Dijkstra {

    private void dijkstra(int[][] graph, int source){
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++){
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        //Distance of self loop is zero
        distance[source] = 0;
        for (int i = 0; i < count; i++){

            //update the distance between neighbouring vertex and source vertex
            int update = findMinDistance(distance, visitedVertex);
            visitedVertex[update] = true;

            for (int vertex = 0; vertex < count; vertex++){
                if (!visitedVertex[vertex] && graph[update][vertex] != 0 &&
                        (distance[update] + graph[update][vertex] < distance[vertex])){
                    distance[vertex] = distance[update] + graph[update][vertex];
                }
            }
        }

        for (int i = 0; i < distance.length; i++){
            System.out.println(String.format("Distance from %s to %s is %s" , source, i, distance[i]));
        }
    }

    private int findMinDistance(int[] distance, boolean[] visitedVertex){
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++){
            if (!visitedVertex[i] && distance[i] < minDistance){
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
                { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
        Dijkstra T = new Dijkstra();
        T.dijkstra(graph, 0);
    }
}
