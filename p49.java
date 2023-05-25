import java.util.*;

class p49 {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public p49(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> iterator = adjacencyList[vertex].listIterator();
        while (iterator.hasNext()) {
            int adjacentVertex = iterator.next();
            if (!visited[adjacentVertex]) {
                DFSUtil(adjacentVertex, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices in the graph: ");
        int numVertices = scanner.nextInt();
        p49 graph = new p49(numVertices);

        System.out.println("Enter the edges in the graph (enter -1 to stop): ");
        while (true) {
            int source = scanner.nextInt();
            if (source == -1) {
                break;
            }
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.print("Enter the starting vertex for DFS traversal: ");
        int startVertex = scanner.nextInt();

        System.out.print("DFS traversal starting from vertex " + startVertex + ": ");
        graph.DFS(startVertex);

        scanner.close();
    }
}
