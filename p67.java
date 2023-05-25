import java.util.Scanner;

public class p67 {
    public static int evaluateExpression(String s) {
        // Remove all whitespace characters from the expression
        s = s.replaceAll("\\s+", "");

        // Create a stack to store the operands
        Stack<Integer> stack = new Stack<>();

        // Initialize variables
        int num = 0;
        char sign = '+';

        // Iterate through the characters of the expression
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a digit, update the num variable
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            // If the current character is not a digit or we have reached the end of the expression,
            // perform the arithmetic operation based on the previous sign
            if (!Character.isDigit(c) || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                // Update the sign and reset the num variable
                sign = c;
                num = 0;
            }
        }

        // Calculate the final result by summing up all the values in the stack
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        int result = evaluateExpression(expression);
        System.out.println("The value of the expression is: " + result);

        scanner.close();
    }
}
