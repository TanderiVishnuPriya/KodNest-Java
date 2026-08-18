public class ArrayAvg {
    public static void main(String[] args) {
        // Write your code here.
        int[] marks = { 70, 80, 60, 90, 50 };
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total: " + total);
        double avg = (double) total / marks.length;
        System.out.println("Average: " + avg);
    }
}