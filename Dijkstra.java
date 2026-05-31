import java.util.*;

public class Dijkstra {

    public void dijkstra(int[][] graph, int source) {

        int V = graph.length;

        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[source] = 0;

        for(int count=0; count<V-1; count++) {

            int u = -1;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<V;i++) {
                if(!visited[i] && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }

            visited[u] = true;

            for(int v=0; v<V; v++) {

                if(!visited[v]
                        && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Dijkstra Distances:");

        for(int i=0;i<V;i++)
            System.out.println(i + " : " + dist[i]);
    }
}