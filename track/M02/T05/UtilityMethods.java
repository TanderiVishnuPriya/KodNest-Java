import java.util.Scanner;

class StudentUtility {

    // Create the four required methods
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double calculate = (double) (javaScore + sqlScore) / 2;
        return calculate;
    }
}

public class UtilityMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input
        int id = scanner.nextInt();
        scanner.nextLine();

        String name = scanner.nextLine();

        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        // Call methods and display the result
        utility.showReportTitle();
        utility.displayStudent(id, name);

        double pass = utility.getPassingPercentage();

        double pass1 = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + pass1);

        if (pass1 >= pass) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}