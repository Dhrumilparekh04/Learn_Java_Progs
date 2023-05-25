import java.util.Arrays;
import java.util.Scanner;

public class p62 {
    public static String nextLexicographicalString(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        // Find the rightmost character that is smaller than its next character
        int i = n - 2;
        while (i >= 0 && charArray[i] >= charArray[i + 1]) {
            i--;
        }

        if (i < 0) {
            // The string is already in the highest lexicographical order
            return "No next lexicographical string exists.";
        }

        // Find the smallest character greater than the character at index i
        int j = n - 1;
        while (charArray[j] <= charArray[i]) {
            j--;
        }

        // Swap the characters at indices i and j
        swap(charArray, i, j);

        // Reverse the suffix after index i
        reverse(charArray, i + 1, n - 1);

        return new String(charArray);
    }

    public static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            swap(charArray, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();
        scanner.close();

        String nextString = nextLexicographicalString(input);
        System.out.println("Next lexicographical string from " + input + ": " + nextString);
    }
}
