import java.util.Scanner;

class Learner1 {
    int id;
    String name;
    int javaScore;
}

public class ObjectSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Learner1 first = new Learner1();
        first.id = sc.nextInt();
        first.name = sc.next();
        first.javaScore = sc.nextInt();

        Learner1 second = new Learner1();
        second.id = sc.nextInt();
        second.name = sc.next();
        second.javaScore = sc.nextInt();

        int newScore = sc.nextInt();

        System.out.println("Before Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        first.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        sc.close();
    }
}