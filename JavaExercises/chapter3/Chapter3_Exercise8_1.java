/*
 * Locker Puzzle (Teacher Version)
 * - 50 lockers, 50 players
 * - true  = open, false = closed
 * - All lockers start open
 * - P1 opens all lockers
 * - P2 closes every other locker (L2, L4, ...)
 * - P3–P50 toggle every p-th locker
 */

public class Chapter3_Exercise8_1 {
    public static void main(String[] args) {

        int N = 50;

        // Create lockers array
        boolean[] lockers = new boolean[N];

        // Start: all lockers are open
        for (int i = 0; i < N; i++) {
            lockers[i] = true;
        }

        // Player 1: open all lockers (no change)
        for (int i = 0; i < N; i++) {
            lockers[i] = true;
        }

        // Player 2: close every other locker (L2, L4, L6, ...)
        for (int i = 1; i < N; i += 2) {
            lockers[i] = false;
        }

        // Players 3 to 50: toggle every p-th locker
        for (int p = 3; p <= N; p++) {
            for (int l = p - 1; l < N; l += p) {
                lockers[l] = !lockers[l];
            }
        }

        // Display open lockers and count them
        int totalOpen = 0;
        System.out.print("Open lockers: ");
        for (int i = 0; i < N; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
                totalOpen++;
            }
        }

        // Display total number of open lockers
        System.out.println("\nTotal open lockers: " + totalOpen);
    }
}
