public class p70 {
    public static int findIntegers(int n) {
        // Create a Fibonacci sequence up to 32 bits (maximum integer value)
        int[] fib = new int[32];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < 32; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Calculate the number of integers without consecutive ones
        int count = 0;
        int prevBit = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {  // Check if the bit at position i is set
                count += fib[i];        // Add the count of valid integers up to this bit position
                if (prevBit == 1) {
                    // If the previous bit is also set, we have consecutive ones, so subtract the count
                    count--;
                    break;  // No need to continue checking lower bit positions
                }
                prevBit = 1;
            } else {
                prevBit = 0;
            }
        }

        // Add 1 to count for n itself (since n is included in the range)
        return count + 1;
    }

    public static void main(String[] args) {
        int n = 15;
        int result = findIntegers(n);
        System.out.println("Number of integers without consecutive ones in the range [0, " + n + "]: " + result);
    }
}
