import java.util.Arrays;

public class p66 {
    public static int smallestDistancePair(int[] nums, int k) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];

        // Binary search for the k-th smallest distance
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countPairs(nums, mid);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Helper method to count the number of pairs with distance less than or equal to target
    private static int countPairs(int[] nums, int target) {
        int count = 0;
        int n = nums.length;

        int left = 0;
        for (int right = 0; right < n; right++) {
            while (nums[right] - nums[left] > target) {
                left++;
            }
            count += right - left;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2};
        int k = 3;

        int result = smallestDistancePair(nums, k);
        System.out.println("The " + k + "-th smallest distance among all the pairs is: " + result);
    }
}
