package track.Two_Dimensional_Array;

import java.util.Scanner;

public class MatrixTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] b = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int total1 = 0;
        for (int i = 0; i < size; i++) {
            total1 += a[i];
        }
        int total2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                total2 += b[i][j];
            }
        }
        System.out.println("Array total: " + total1);
        System.out.println("Matrix total: " + total2);
    }
}