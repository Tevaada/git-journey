/* Ask the user to enter a word that contains uppercase and lowercase characters,
then insert a space before every capital letter (except the first character)
appears in the word. */

import java.util.Scanner;

class SpaceInsert_StrClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        // Create an empty string to store the result
        String result = "";

        // First character stays the same
        result += word.charAt(0);

        // Loop from the second character
        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);

            // If the character is uppercase, add a space first
            if (Character.isUpperCase(ch)) {
                result += " ";
            }
            // Add the character
            result += ch;
        }
        
        // Show the result
        System.out.println("Result: " + result);
        input.close();
    }
}