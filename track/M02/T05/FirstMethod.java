class Robot {
    void speak() {
        // Print the message
        System.out.println("Beep beep! Java is my superpower!");
    }
}

public class FirstMethod {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.speak();
    }
}