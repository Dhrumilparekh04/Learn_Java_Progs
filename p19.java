import java.util.ArrayList;
import java.util.Collections;

class p19 {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.8, 0.5, 0.3, 0.2, 0.7};
        bucketSort(arr);

        System.out.println("Sorted array: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bucketSort(double[] arr) {
        if (arr.length == 0)
            return;

        int n = arr.length;
        ArrayList<Double>[] buckets = new ArrayList[n];

        // Initialize empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add elements to the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort the elements in each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the sorted buckets
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (double num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }
}
