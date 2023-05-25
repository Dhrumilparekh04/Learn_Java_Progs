import java.util.Arrays;

public class p41 {
    public static int rearrangeDigits(int num) {
        // Convert the number to a string
        String numStr = String.valueOf(num);

        // Convert the string to a character array
        char[] digits = numStr.toCharArray();

        // Sort the digits array in ascending order
        Arrays.sort(digits);

        // Find the index of the first non-zero digit
        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < digits.length && digits[firstNonZeroIndex] == '0') {
            firstNonZeroIndex++;
        }

        // Rearrange the digits array by moving the first non-zero digit to the front
        char temp = digits[0];
        digits[0] = digits[firstNonZeroIndex];
        digits[firstNonZeroIndex] = temp;

        // Convert the rearranged digits array back to an integer
        int result = Integer.parseInt(new String(digits));

        return result;
    }

    public static void main(String[] args) {
        int num = 310;
        int rearrangedNum = rearrangeDigits(num);
        System.out.println("Output: " + rearrangedNum);
    }
}
