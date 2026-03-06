/*
* Game: Locker Puzzle
* There are 50 lockers and 50 players. All lockers start closed.
* Each player changes the state of lockers at positions matching
* their player number (open if closed, close if open).
*/

public class Chapter3_Exercise8 {
    public static void main(String[] args) {

        // Create 50 lockers (false = closed, true = open)
        boolean[] lockers = new boolean[50];

        // Players 1 to 50
        for (int p = 1; p <= 50; p++) {

            // Player p toggles every p-th locker starting from locker p
            for (int l = p - 1; l < 50; l += p) {
                // Toggle (change state) of the locker
                lockers[l] = !lockers[l];
            }
        }
        
        // Display open lockers and count
        int totalOpen = 0;
        System.out.print("Open lockers: ");

        // Check each locker
        for (int i = 0; i < lockers.length; i++) {
            // If locker is open, print its number
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
                totalOpen++;
            }
        }

        // Display results
        System.out.println("\nTotal open lockers: " + totalOpen);
    }
}
