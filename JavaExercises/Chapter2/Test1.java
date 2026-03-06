import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a password: ");
            String password = input.nextLine();

            if (password.length() >= 8 && password.length() <= 20 && Character.isDigit(password.charAt(0))) {
                
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }
    }
}