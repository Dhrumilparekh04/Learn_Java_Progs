import java.util.Scanner;

public class p53 {
    public static int calculateDistance(int num1, int num2) {
        int xor = num1 ^ num2;
        int distance = 0;

        while (xor != 0) {
            if ((xor & 1) == 1) {
                distance++;
            }
            xor >>= 1;
        }

        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int distance = calculateDistance(num1, num2);

        System.out.println("The distance between " + num1 + " and " + num2 + " is: " + distance);

        scanner.close();
    }
}
