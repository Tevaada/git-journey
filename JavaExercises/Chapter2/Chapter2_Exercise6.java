/* 
    Remove duplicate characters (except whitespaces) of a given sentence.
    The comparison is NOT case-sensitive.
*/

import java.util.Scanner;

class Chapter2_Exercise6 {
    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();  // Reads the entire line
        input.close();// Close the scanner 

        String result = "";  // String to store the final result
        String s = "";

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); 

            if (ch == ' ') { // If the character is a space, keep it
                result += ch;
            } else {
                char lower = Character.toLowerCase(ch); // Convert character to lowercase for comparison
                if (s.indexOf(lower) == -1) {
                    result += ch;   // Add original character to result
                    s += lower;  // Mark character as seen
                }
            }
        }
        // Display the final result
        System.out.println("Result: " + result);
    }
}

