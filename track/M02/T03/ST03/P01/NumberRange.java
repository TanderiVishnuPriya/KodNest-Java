import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze its numbers
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + 1;
            }
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddSum);

        scanner.close();
    }
}