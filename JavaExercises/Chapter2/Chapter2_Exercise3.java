/*  Remove all consonants from a given sentence.
    Only vowels (a, e, i, o, u), spaces, and special characters are kept. */

import java.util.Scanner;
public class Chapter2_Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: "); // Ask the user to enter a sentence
        StringBuilder input = new StringBuilder(sc.nextLine());

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char lower = Character.toLowerCase(ch);

            // Keep vowels and non-letter characters
            if (lower == 'a' || lower == 'e' || lower == 'i' ||
                lower == 'o' || lower == 'u' || !Character.isLetter(ch)) {
                result.append(ch);
            }
            // Consonants are skipped
        }

        // Display the result
        System.out.println("Sentence after removing consonants:");
        System.out.println(result);
        sc.close();
    }
}
