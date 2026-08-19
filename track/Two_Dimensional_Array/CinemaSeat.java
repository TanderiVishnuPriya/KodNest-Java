package track.Two_Dimensional_Array;

import java.util.Scanner;

public class CinemaSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    count += 1;
                }
            }
        }
        System.out.println("Available seats: " + count);
    }
}