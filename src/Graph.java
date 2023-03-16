import java.util.*;
public class Graph {
    private final Map<String, ArrayList<String>> adj;

    public Graph() {
        adj = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adj.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        ArrayList<String> edges = adj.get(from);
        edges.add(to);
        adj.put(from, edges);
    }

    public void printGraph() {
        for (String vertex : adj.keySet()) {
            System.out.print(vertex + " -> ");
            List<String> edges = adj.get(vertex);
            for (String edge : edges) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> onStack = new HashSet<>();

        for (String vertex : adj.keySet()) {
            if (hasCycleHelper(vertex, visited, onStack)) {
                return true;
            }
        }

        return false;
    }

    private boolean hasCycleHelper(String vertex, Set<String> visited, Set<String> onStack) {
        visited.add(vertex);
        onStack.add(vertex);

        List<String> edges = adj.get(vertex);
        for (String edge : edges) {
            if (!visited.contains(edge)) {
                if (hasCycleHelper(edge, visited, onStack)) {
                    return true;
                }
            } else if (onStack.contains(edge)) {
                return true;
            }
        }

        onStack.remove(vertex);
        return false;
    }
}