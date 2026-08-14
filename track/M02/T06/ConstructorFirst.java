import java.util.Scanner;

class Studentm {
    String name;

    Studentm(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorFirst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();

        // Create one Student object
        Studentm s = new Studentm(name);

        // Call display()
        s.display();

        scanner.close();
    }
}