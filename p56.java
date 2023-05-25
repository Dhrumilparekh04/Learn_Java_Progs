import java.util.Arrays;

public class p56 {
    public static int findMinAverageDifferenceIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0] = nums[0];
        suffixSum[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            suffixSum[n - i - 1] = suffixSum[n - i] + nums[n - i - 1];
        }

        int minDiffIndex = 0;
        int minDiff = Math.abs(prefixSum[0] / 1 - suffixSum[1] / (n - 1));

        for (int i = 1; i < n - 1; i++) {
            int avgDiff = Math.abs(prefixSum[i] / (i + 1) - suffixSum[i + 1] / (n - i - 1));
            if (avgDiff < minDiff) {
                minDiff = avgDiff;
                minDiffIndex = i;
            }
        }

        return minDiffIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 9, 5, 3};
        int minDiffIndex = findMinAverageDifferenceIndex(nums);
        System.out.println("Index with minimum average difference: " + minDiffIndex);
    }
}
