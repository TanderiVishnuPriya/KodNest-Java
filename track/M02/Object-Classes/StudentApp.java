class Studenta {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Studenta s = new Studenta();
        s.input("Raja", 18, 5.5);
        s.display();
    }
}
