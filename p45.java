import java.util.Scanner;

class p45 {
    public static String hexToOctal(String hex) {
        StringBuilder octalBuilder = new StringBuilder();
        String binary = hexToBinary(hex);
        octalBuilder.append(binaryToOctal(binary));
        return octalBuilder.toString();
    }

    public static String hexToBinary(String hex) {
        StringBuilder binaryBuilder = new StringBuilder();
        String hexChars = "0123456789ABCDEF";
        String[] binaryValues = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int hexValue = hexChars.indexOf(hexChar);
            binaryBuilder.append(binaryValues[hexValue]);
        }
        return binaryBuilder.toString();
    }

    public static String binaryToOctal(String binary) {
        StringBuilder octalBuilder = new StringBuilder();
        int numDigits = binary.length() / 3;
        int padding = 3 - (binary.length() % 3);
        if (padding != 3) {
            binary = "0".repeat(padding) + binary;
            numDigits++;
        }
        for (int i = 0; i < numDigits; i++) {
            int startIndex = i * 3;
            String binaryChunk = binary.substring(startIndex, startIndex + 3);
            int octalValue = Integer.parseInt(binaryChunk, 2);
            octalBuilder.append(octalValue);
        }
        return octalBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        String octal = hexToOctal(hex);
        System.out.println("Octal representation: " + octal);

        scanner.close();
    }
}
