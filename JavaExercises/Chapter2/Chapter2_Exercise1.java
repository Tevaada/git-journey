/* Convert each alphabet of a sentence (which can contain spaces and special characters)
into its next alphabet and print the sentence.Note: Ignore all characters that are not letters */

import java.util.Scanner;
public class Chapter2_Exercise1{
    public static void main(String[] args) {

        // Ask the user to enter a sentence
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();     // reads the entire line as a String
        String result = "";                  // An empty String to store the converted sentence
        
        // loop through each character using length() and charAt()
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // check if the character is a letter
            if (Character.isLetter(ch)) { 
                if (ch == 'Z') {
                    result += 'A';           
                    // special case: Z to A
                } 
                else if (ch == 'z') {
                    result += 'a';           
                    // special case: z to a
                } 
                else {
                    result += (char)(ch + 1); 
                    // convert to next alphabet using ASCII value
                }
            } 
            else {
                result += ch;                
                // non-letter characters remain unchanged
            }
        }
        // Display the converted sentence
        System.out.print("Converted sentence: ");
        System.out.print(result);
        sc.close();
    }
}
