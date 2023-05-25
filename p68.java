public class p68 {
    public static int numSquares(int n) {
        // Create an array to store the least number of perfect squares for each number up to n
        int[] dp = new int[n + 1];

        // Initialize the dp array with maximum values
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Pre-calculate perfect squares up to n
        int sqrt = getSquareRoot(n);
        int[] squares = new int[sqrt];
        for (int i = 0; i < sqrt; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        // Fill the dp array using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sqrt; j++) {
                if (i < squares[j]) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - squares[j]] + 1);
            }
        }

        return dp[n];
    }

    // Helper function to calculate the square root of n
    private static int getSquareRoot(int n) {
        int sqrt = 1;
        while (sqrt * sqrt <= n) {
            sqrt++;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int n = 12;
        int result = numSquares(n);
        System.out.println("The least number of perfect square numbers that sum to " + n + " is: " + result);
    }
}
