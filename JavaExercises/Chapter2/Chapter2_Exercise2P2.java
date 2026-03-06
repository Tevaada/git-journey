/*  Ask the user to enter a word that contains uppercase and lowercase characters,
    then insert a space before every capital letter (except the first character)
    appears in the word. */

import java.util.Scanner;
class Chapter2_Exercise2P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a word
        System.out.println("Enter a word");          

        // Convert input String to StringBuilder
        StringBuilder input = new StringBuilder(sc.nextLine());
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // First character stays the same
        result.append(input.charAt(0));

        // Loop from the second character
        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is uppercase, add a space first
            if (Character.isUpperCase(ch)) {
                result.append(' ');
            }
            // Add the character
            result.append(ch);
        }
        // Display result
        System.out.println("Result: " + result.toString());
        sc.close();
    }
}
