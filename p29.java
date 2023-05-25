import java.util.Scanner;

public class p29{
    public static int[] divide(int dividend, int divisor) {
        // Flag variable if negative dividend or divisor is entered
        boolean negative = false;

        // Division with zero is not valid
        if (dividend == 0 || divisor == 0) {
            return null;
        }

        // If any one is negative, set the flag to true
        if (divisor < 0 || dividend < 0) {
            negative = true;
        }

        // For further performing division, we are making these values positive irrespective of their sign
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initializing variables
        int quotient = 0;
        int remainder = 0;

        // Loop until dividend is less than divisor
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient += 1;
        }

        remainder = dividend;

        // If divisor or dividend were flagged as true, we are supposed to return a negative quotient
        if (negative) {
            quotient = -quotient;
        }

        // Returning the quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        // User might enter a smaller number divided by a bigger number, so we need to check and swap
        // in order to keep the dividend greater than the divisor
        int dn, ds;
        if (a > b) {
            dn = a;
            ds = b;
        } else {
            dn = b;
            ds = a;
        }

        int[] result = divide(dn, ds);
        if (result != null) {
            System.out.println("Your quotient and remainder are: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Unexpected input!!");
        }
    }
}
