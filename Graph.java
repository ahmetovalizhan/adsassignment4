import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // add vertex
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    // add edge
    public void addEdge(int from, int to) {

        adjList.get(from).add(to);

        // undirected graph
        adjList.get(to).add(from);
    }

    // print graph
    public void printGraph() {

        for (int vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    // BFS traversal
    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : adjList.get(current)) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // DFS traversal
    public void dfs(int start) {

        Set<Integer> visited = new HashSet<>();

        dfsHelper(start, visited);
    }

    private void dfsHelper(int current, Set<Integer> visited) {

        visited.add(current);

        System.out.print(current + " ");

        for (int neighbor : adjList.get(current)) {

            if (!visited.contains(neighbor)) {

                dfsHelper(neighbor, visited);
            }
        }
    }
}