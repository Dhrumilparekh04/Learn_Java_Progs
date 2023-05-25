import java.util.*;

class p48 {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public p48(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int adjacentVertex = iterator.next();
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices in the graph: ");
        int numVertices = scanner.nextInt();
        p48 graph = new p48(numVertices);

        System.out.println("Enter the edges in the graph (enter -1 to stop): ");
        while (true) {
            int source = scanner.nextInt();
            if (source == -1) {
                break;
            }
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.print("Enter the starting vertex for BFS traversal: ");
        int startVertex = scanner.nextInt();

        System.out.print("BFS traversal starting from vertex " + startVertex + ": ");
        graph.BFS(startVertex);

        scanner.close();
    }
}
