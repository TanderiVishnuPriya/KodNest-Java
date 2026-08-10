import java.util.Scanner;

class Student1 {
    int id;
    String name;
    int javaScore;
}

public class TwoStudents {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student1 s1 = new Student1();

        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.javaScore = scanner.nextInt();

        Student1 s2 = new Student1();

        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.javaScore = scanner.nextInt();

        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        if (s1.javaScore > s2.javaScore) {

            System.out.println(s1.name + " has the higher Java score.");

        } else if (s2.javaScore > s1.javaScore) {

            System.out.println(s2.name + " has the higher Java score.");

        } else {

            System.out.println("Both students have the same Java score.");
        }

        scanner.close();
    }
}