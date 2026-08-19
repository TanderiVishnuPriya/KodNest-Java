import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Age is: " + age);
        System.out.println("Enter your height:");
        float height = sc.nextFloat();
        System.out.println("Height is:" + height);
        sc.nextLine();
        System.out.println("Enter your name: ");
        String fname = sc.nextLine();
        System.out.println("Name is:" + fname);
        sc.close();
    }
}
