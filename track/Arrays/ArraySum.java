import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Write your code here.
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Total: " + sum);
    }
}