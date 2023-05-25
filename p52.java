public class p52 {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid; // Keep track of the last valid result
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {
        int x = 16;
        int sqrt = mySqrt(x);

        System.out.println("Square root of " + x + " is: " + sqrt);
    }
}
