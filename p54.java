// Note: Make sure to input the values as space-separated integers.

import java.util.Scanner;

public class p54 {
    public static int findMinMoves(int[] machines) {
        int total = 0;
        int n = machines.length;

        for (int num : machines) {
            total += num;
        }

        if (total % n != 0) {
            return -1;
        }

        int avg = total / n;
        int moves = 0;
        int balance = 0;

        for (int num : machines) {
            int diff = num - avg;
            balance += diff;
            moves = Math.max(moves, Math.max(Math.abs(balance), diff));
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of washing machines: ");
        int n = scanner.nextInt();
        int[] machines = new int[n];

        System.out.println("Enter the number of dresses in each washing machine:");

        for (int i = 0; i < n; i++) {
            machines[i] = scanner.nextInt();
        }

        int minMoves = findMinMoves(machines);
        System.out.println("Minimum number of moves: " + minMoves);

        scanner.close();
    }
}
