import java.util.Scanner;

public class ProgressSummary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read learner details
        String fullName = scanner.nextLine();
        int pracDays = scanner.nextInt();
        int solvedProb;
        int total = 0;
        // Read problems solved for each day
        for (int i = 1; i <= pracDays; i++) {
            solvedProb = scanner.nextInt();
            total = total + solvedProb;
        }
        // Calculate average after all days are read
        double avg = (double) total / pracDays;

        // Display progress summary
        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + avg);
        if (avg >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }

        scanner.close();
    }
}