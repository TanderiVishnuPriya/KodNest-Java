public class TraceArray {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };

        // Required variables
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        int j = 0;
        for (int i = 0; i < original.length; i++) {
            snapshot[j] = original[i];
            j++;
        }

        // Create a reference to original
        int[] liveView = original;

        // Update through liveView
        liveView[updateIndex] = updatedValue;

        // Display original
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        // Display snapshot
        System.out.print("\nSnapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();

        // Compare references
        System.out.print("Same object: ");
        boolean res;

        if (original == liveView) {
            res = true;
        } else {
            res = false;
        }

        System.out.println(res);

        // Validate requestedIndex before accessing original
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}