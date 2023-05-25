import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter k steps to rotate array: ");
        int k = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter elements of array: ");
        String[] elements = scanner.nextLine().split(" ");

        List<Integer> arr = new ArrayList<>();
        for (String element : elements) {
            arr.add(Integer.parseInt(element));
        }

        while (k != 0) {
            int a = arr.remove(arr.size() - 1);
            arr.add(0, a);
            k--;
        }

        System.out.println(arr);
    }
}
