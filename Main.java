public class Main {

    public static void main(String[] args) {

        int[][] graph = {
                {0,4,1,0},
                {4,0,2,5},
                {1,2,0,8},
                {0,5,8,0}
        };

        Dijkstra dijkstra =
                new Dijkstra();

        dijkstra.dijkstra(graph,0);

        int[][] edges = {
                {0,1,4},
                {0,2,1},
                {2,1,2},
                {1,3,5}
        };

        BellmanFord bf =
                new BellmanFord();

        bf.bellmanFord(4,
                edges,
                0);

        FloydWarshall fw =
                new FloydWarshall();

        fw.floydWarshall(graph);

        int[] deliveries =
                {45,12,89,23,5};

        MergeSort.sort(deliveries);

        System.out.println(
                "Merge Sort Completed");

        QuickSort.sort(deliveries);

        System.out.println(
                "Quick Sort Completed");
    }
}