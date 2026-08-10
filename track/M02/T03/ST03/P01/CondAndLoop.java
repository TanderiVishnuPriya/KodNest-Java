import java.util.Scanner;

public class CondAndLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int pracDays = scanner.nextInt();

        int totalProbSol = 0;

        for (int i = 1; i <= pracDays; i++) {

            totalProbSol = scanner.nextInt() + totalProbSol;
        }

        System.out.println("Total solved: " + totalProbSol);

        if (totalProbSol >= 20) {
            System.out.println("Status: Strong progress");
        } else if (totalProbSol >= 10 && totalProbSol <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        // Close scanner
        scanner.close();
    }
}