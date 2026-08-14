class Studenty {
    String name;
    int age;
    double height;

    Studenty() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Studenty(String name) {
        this.name = name;
    }

    Studenty(String name, int age, double height) {
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

public class ConstructorOverload {
    public static void main(String[] args) {
        Studenty s2 = new Studenty();
        s2.display();
        Studenty s3 = new Studenty("Mani");
        s3.display();
        Studenty s1 = new Studenty("Raja", 18, 5.5);
        s1.display();
    }
}