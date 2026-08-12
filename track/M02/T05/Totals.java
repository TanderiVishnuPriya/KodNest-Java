import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class Totals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator r = new ResultCalculator();

        // Call both overloaded methods
        int a = r.getTotal(first, second);
        int b = r.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + a);
        System.out.println("Three-Mark Total: " + b);

        scanner.close();
    }
}