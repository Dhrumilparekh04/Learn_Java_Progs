import java.util.Scanner;

public class p40 {
    public static boolean checkPossibility(int[] nums) {
        int count = 0; // Count of instances where current element is smaller than previous element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;

                // If there are more than one instances, return false
                if (count > 1) {
                    return false;
                }

                // Check if modifying the current or previous element would make the array non-decreasing
                if (i >= 2 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1]; // Modify the current element
                } else {
                    nums[i - 1] = nums[i]; // Modify the previous element
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean isNonDecreasing = checkPossibility(nums);
        System.out.println("Output: " + isNonDecreasing);
    }
}
