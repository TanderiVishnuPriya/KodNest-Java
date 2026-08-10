import java.util.Scanner;

public class ExpenseCal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float monthlyIncome = scanner.nextFloat();
        float rentExpense = scanner.nextFloat();
        float foodExpense = scanner.nextFloat();
        float travelExpense = scanner.nextFloat();

        float total = rentExpense + foodExpense + travelExpense;
        float remaining = monthlyIncome - total;

        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + remaining);

        if (remaining >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scanner.close();
    }
}