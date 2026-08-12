import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class FourMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one object
        MethodDemo s = new MethodDemo();

        // Call all four methods
        s.sayHello();
        s.greet(name);

        int number = s.getLuckyNumber();
        System.out.println("Lucky Number: " + number);

        int res = s.add(first, second);
        System.out.println("Sum: " + res);
    }
}