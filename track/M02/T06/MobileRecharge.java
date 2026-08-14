import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobileRecharge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        // Create the default plan
        MobilePlan m = new MobilePlan();

        // Create the selected plan
        MobilePlan m1 = new MobilePlan(planName, price);

        // Display both plans
        m.display();
        m1.display();

        scanner.close();
    }
}