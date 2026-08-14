class Studentz {
    String name;
    int age;
    double height;

    Studentz(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplic {
    public static void main(String[] args) {
        Studentz s1 = new Studentz("Rani", 19, 4.5);
        s1.display();
    }
}