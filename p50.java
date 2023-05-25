import java.util.*;

public class p50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the edges of the directed graph (enter -1 to stop):");
        
        List<Integer> vertices = new ArrayList<>();
        List<Integer> degrees = new ArrayList<>();
        
        int maxVertex = -1;
        int vertex, degree;
        
        while (true) {
            vertex = scanner.nextInt();
            if (vertex == -1) {
                break;
            }
            
            int nextVertex = scanner.nextInt();
            
            // Update the maximum vertex
            maxVertex = Math.max(maxVertex, vertex);
            maxVertex = Math.max(maxVertex, nextVertex);
            
            if (!vertices.contains(vertex)) {
                vertices.add(vertex);
                degrees.add(0);
            }
            
            if (!vertices.contains(nextVertex)) {
                vertices.add(nextVertex);
                degrees.add(0);
            }
            
            int index = vertices.indexOf(nextVertex);
            degrees.set(index, degrees.get(index) + 1);
        }
        
        System.out.println("Degree of each vertex:");
        for (int i = 0; i <= maxVertex; i++) {
            int degreeIndex = vertices.indexOf(i);
            if (degreeIndex != -1) {
                degree = degrees.get(degreeIndex);
            } else {
                degree = 0;
            }
            System.out.println("Vertex " + i + ": " + degree);
        }
    }
}
