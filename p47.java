import java.util.Scanner;

class p47 {
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexBuilder = new StringBuilder();
        while (decimal != 0) {
            int remainder = decimal % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
            hexBuilder.insert(0, hexDigit);
            decimal /= 16;
        }
        return hexBuilder.toString();
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexChar = hexadecimal.charAt(i);
            int digit = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
            decimal = decimal * 16 + digit;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Hexadecimal representation: " + hexadecimal);

        System.out.print("Enter a hexadecimal number: ");
        String inputHexadecimal = scanner.next();

        int decimalValue = hexadecimalToDecimal(inputHexadecimal);
        System.out.println("Decimal representation: " + decimalValue);

        scanner.close();
    }
}
