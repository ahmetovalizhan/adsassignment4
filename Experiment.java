public class Experiment {

    public void runTraversals(Graph graph, int size) {

        System.out.println("\n==============================");
        System.out.println("GRAPH SIZE: " + size);
        System.out.println("==============================");

        // BFS
        long start = System.nanoTime();

        System.out.println("\nBFS Traversal:");
        graph.bfs(0);

        long end = System.nanoTime();

        long bfsTime = end - start;

        System.out.println("\nBFS Time: " + bfsTime + " ns");


        // DFS
        start = System.nanoTime();

        System.out.println("\nDFS Traversal:");
        graph.dfs(0);

        end = System.nanoTime();

        long dfsTime = end - start;

        System.out.println("\nDFS Time: " + dfsTime + " ns");
    }
}