import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 50;
        int guess = 0;           // must start with wrong value
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;          // count every try

            if (guess != secret) {               // ← feedback only if wrong
                if (guess < secret)
                    System.out.println("Too low!!");
                else
                    System.out.println("Too high!!");
            }
        } while (guess != secret);

        System.out.println("Well done, you took " + attempts + " attempts!");
        sc.close();
    }
}
