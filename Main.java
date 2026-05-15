public class Main {

    public static void main(String[] args) {

        Experiment experiment = new Experiment();

        // SMALL GRAPH
        Graph smallGraph = createGraph(10);

        System.out.println("SMALL GRAPH STRUCTURE:");
        smallGraph.printGraph();

        experiment.runTraversals(smallGraph, 10);


        // MEDIUM GRAPH
        Graph mediumGraph = createGraph(30);

        experiment.runTraversals(mediumGraph, 30);


        // LARGE GRAPH
        Graph largeGraph = createGraph(100);

        experiment.runTraversals(largeGraph, 100);
    }

    // create graph method
    public static Graph createGraph(int size) {

        Graph graph = new Graph();

        // add vertices
        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        // add edges
        for (int i = 0; i < size - 1; i++) {

            graph.addEdge(i, i + 1);

            // additional edges
            if (i + 2 < size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }
}