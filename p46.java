import java.util.Scanner;

class p46 {
    public static String decimalToOctal(int decimal) {
        StringBuilder octalBuilder = new StringBuilder();
        while (decimal != 0) {
            int remainder = decimal % 8;
            octalBuilder.insert(0, remainder);
            decimal /= 8;
        }
        return octalBuilder.toString();
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            char octalChar = octal.charAt(i);
            int digit = octalChar - '0';
            decimal = decimal * 8 + digit;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = decimalToOctal(decimal);
        System.out.println("Octal representation: " + octal);

        System.out.print("Enter an octal number: ");
        String inputOctal = scanner.next();

        int decimalValue = octalToDecimal(inputOctal);
        System.out.println("Decimal representation: " + decimalValue);

        scanner.close();
    }
}
