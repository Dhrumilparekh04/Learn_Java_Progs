import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p58 {
    public static boolean isHappyNumber(int number) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (number != 1) {
            if (seenNumbers.contains(number)) {
                return false;
            }

            seenNumbers.add(number);

            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }

            number = sum;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isHappy = isHappyNumber(number);

        if (isHappy) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }

        scanner.close();
    }
}
