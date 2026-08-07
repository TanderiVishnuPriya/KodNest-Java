import java.util.Scanner;

public class Learner {
    public static void main(String[] args) {

        // Read and display the profile
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        int solvedProblems = sc.nextInt();
        double assessmentPercentage = sc.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        sc.close();

    }

}