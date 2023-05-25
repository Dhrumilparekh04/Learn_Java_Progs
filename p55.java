import java.util.HashMap;
import java.util.Map;

public class p55 {
    public static int removeBoxes(int[] boxes) {
        int n = boxes.length;
        int[][][] dp = new int[n][n][n];
        return calculatePoints(boxes, dp, 0, n - 1, 0);
    }

    public static int calculatePoints(int[] boxes, int[][][] dp, int i, int j, int k) {
        if (i > j) {
            return 0;
        }

        if (dp[i][j][k] != 0) {
            return dp[i][j][k];
        }

        int maxPoints = (k + 1) * (k + 1) + calculatePoints(boxes, dp, i + 1, j, 0);

        for (int m = i + 1; m <= j; m++) {
            if (boxes[m] == boxes[i]) {
                maxPoints = Math.max(maxPoints,
                        calculatePoints(boxes, dp, i + 1, m - 1, 0) + calculatePoints(boxes, dp, m, j, k + 1));
            }
        }

        dp[i][j][k] = maxPoints;
        return maxPoints;
    }

    public static void main(String[] args) {
        int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        int maxPoints = removeBoxes(boxes);
        System.out.println("Maximum points: " + maxPoints);
    }
}
