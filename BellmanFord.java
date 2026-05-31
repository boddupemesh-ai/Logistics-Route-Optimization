public class BellmanFord {

    public void bellmanFord(int vertices,
                            int[][] edges,
                            int source) {

        int[] dist = new int[vertices];

        for(int i=0;i<vertices;i++)
            dist[i] = Integer.MAX_VALUE;

        dist[source] = 0;

        for(int i=1;i<vertices;i++) {

            for(int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if(dist[u] != Integer.MAX_VALUE &&
                   dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                }
            }
        }

        System.out.println("Bellman-Ford Distances:");

        for(int i=0;i<vertices;i++)
            System.out.println(i + " : " + dist[i]);
    }
}
