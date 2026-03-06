/*  Ask the user to enter a sentence, then display the number of words, consonants, and vowels (a, e, i, o 
    and u), special characters (not include spaces) in the sentence.  */
import java.util.Scanner;
public class Chapter2_Exercise9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();    // Read entire line of input from user
        sc.close();

        // Initialize counters for analysis
        int words = 0, vowels = 0, consonants = 0, special = 0;

        // Check if string is not empty
        if (s.length() > 0)
            words = 1;       // assume at least one word
        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check for space (word separator)
            if (ch == ' ')
                words++;
            // Check for alphabetic character
            else if (Character.isLetter(ch)) {
                // Convert to lowercase for vowel checking
                char l = Character.toLowerCase(ch);
                // Check if character is vowel
                if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
                    vowels++;
                // Otherwise it's a consonant
                else
                    consonants++;
            }
            // Check for special characters (exclude digits)
            else if (!Character.isDigit(ch)) {
                special++;
            }
            
        }
        // Display results
        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special characters: " + special);
    }
}
