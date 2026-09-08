import java.util.Scanner;

class CompareTexts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        // Compare the two values in both ways.
        System.out.print("Exact match: ");
        if (firstText.equals(secondText)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("Ignore-case match: ");
        if (firstText.equalsIgnoreCase(secondText)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}