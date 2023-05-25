import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p43 {
    public static int countPairsWithSumK(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int complement = K - arr[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        System.out.print("Enter the target sum (K): ");
        int K = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = countPairsWithSumK(arr, K);
        System.out.println("Number of pairs with sum equal to K: " + result);

        scanner.close();
    }
}
