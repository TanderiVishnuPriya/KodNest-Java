public class MutationTracker {
    public static void main(String[] args) {

        int[] readings = { 12, 14, 16, 18 };

        int updateIndex = 2;
        int newValue = 25;

        int[] snapshot = new int[readings.length];

        int j = 0;

        // Copy readings into snapshot
        for (int i = 0; i < snapshot.length; i++) {
            snapshot[j] = readings[i];
            j++;
        }

        // Update the original array
        readings[updateIndex] = newValue;

        // Display snapshot
        System.out.print("Snapshot:");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(" " + snapshot[i]);
        }

        System.out.println();

        // Display updated readings
        System.out.print("Updated:");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(" " + readings[i]);
        }
    }
}