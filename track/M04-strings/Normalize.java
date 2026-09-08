import java.util.Scanner;

class Normalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        String a = sentence.trim().toLowerCase();
        String b = keyword.trim().toLowerCase();
        System.out.println("Normalized text: " + a);
        boolean c = a.contains(b);
        System.out.println("Contains keyword: " + c);

    }
}