/*  (Check Valid Password) Some websites impose certain rules for passwords.
    • must have exactly 8 characters. 
    • must consist of both digits and letters, but no spaces or special characters. 
    • must always start with a digit. 
    • must contain at least one uppercase letter. 
    displays whether it is valid or invalid with the reason.*/
import java.util.Scanner;
public class Chapter2_Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password;
        // Loop until a valid password is entered
        while (true) {

            System.out.print("Enter password: ");
            password = sc.nextLine();
            
            // Rule 1: Password length must be exactly 8 characters
            if (password.length() != 8) {
                System.out.println("Invalid: Password must be 8 characters long.");
                continue;
            }
            // Rule 2: Password must start with a digit
            if (!Character.isDigit(password.charAt(0))) {
                System.out.println("Invalid: Password must start with a digit.");
                continue;
            }
            boolean hasUppercase = false;   // Checks if at least one uppercase letter exists
            boolean validCharacters = true; // Checks if only letters and digits are used
            // Rule 3
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                // Reject spaces or special characters
                if (!Character.isLetterOrDigit(ch)) {
                    System.out.println("Invalid: Only letters and digits are allowed.");
                    validCharacters = false;
                    break;
                }
                // Check for uppercase letter
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }
            }
            // If invalid characters were found, restart loop
            if (!validCharacters) {
                continue;
            }
            // Rule 4: Must contain at least one uppercase letter
            if (!hasUppercase) {
                System.out.println("Invalid: Must contain at least one uppercase letter.");
                continue;
            }
            // All rules satisfied
            System.out.println("Password is valid.");
            break;

        }
        // Close scanner resource
        sc.close();
    }
}
