public class p69 {
    public static int findNthDigit(int n) {
        int digitCount = 1;     // Number of digits in the current number
        long numberCount = 9;   // Number of numbers with the current number of digits
        int startNumber = 1;    // First number with the current number of digits

        while (n > digitCount * numberCount) {
            n -= digitCount * numberCount;
            digitCount++;
            numberCount *= 10;
            startNumber *= 10;
        }

        // Calculate the actual number and digit within the number
        int actualNumber = startNumber + (n - 1) / digitCount;
        int digitIndex = (n - 1) % digitCount;

        // Extract the digit from the actual number
        return Integer.toString(actualNumber).charAt(digitIndex) - '0';
    }

    public static void main(String[] args) {
        int n = 11;
        int result = findNthDigit(n);
        System.out.println("The " + n + "th digit of the infinite sequence is: " + result);
    }
}
