import java.util.Scanner;

public class p44 {
    public static String octalToHexadecimal(String octal) {
        String hexChars = "0123456789ABCDEF";
        StringBuilder hexadecimal = new StringBuilder();
        for (int i = 0; i < octal.length(); i++) {
            char octalChar = octal.charAt(i);
            int octalValue = Character.getNumericValue(octalChar);
            StringBuilder binaryBuilder = new StringBuilder();
            while (octalValue > 0) {
                int remainder = octalValue % 2;
                binaryBuilder.append(remainder);
                octalValue /= 2;
            }
            String binary = binaryBuilder.reverse().toString();
            int decimalValue = Integer.parseInt(binary, 2);
            char hexChar = hexChars.charAt(decimalValue);
            hexadecimal.append(hexChar);
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        String hexadecimal = octalToHexadecimal(octal);
        System.out.println("Hexadecimal representation: " + hexadecimal);

        scanner.close();
    }
}
