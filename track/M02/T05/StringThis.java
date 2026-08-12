import java.util.Scanner;

class Studentb {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {
        // Print the stored name
        System.out.println("Student Name: " + this.name);
    }
}

public class StringThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        Studentb s = new Studentb();

        // Call setName() and displayName()
        s.setName(name);
        s.displayName();
    }
}