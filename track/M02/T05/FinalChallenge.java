import java.util.Scanner;

class Studentd {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Score Total: " + (first + second));
    }
}

public class FinalChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the full name and two scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one Student object
        Studentd s = new Studentd();

        // Store the name in the object
        s.setName(name);

        // Print the name
        s.showName();

        // Call both overloaded showScore() methods
        s.showScore(first);
        s.showScore(first, second);

        scanner.close();
    }
}