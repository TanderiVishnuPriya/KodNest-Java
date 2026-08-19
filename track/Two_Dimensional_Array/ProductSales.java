package track.Two_Dimensional_Array;

import java.util.Scanner;

public class ProductSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = sc.nextInt();
        int month = sc.nextInt();
        int sales[][] = new int[product][month];
        for (int i = 0; i < product; i++) {
            for (int j = 0; j < month; j++) {
                sales[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < product; i++) {
            int total = 0;
            for (int j = 0; j < month; j++) {
                total += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}