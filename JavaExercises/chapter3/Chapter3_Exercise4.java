/*(Assign grades) Ask the user to enter five scores separated by a space in one line, and then assigns 
    grades based on the following scheme:  
    The grade is A if score is >= 90.  
    The grade is B if 90 > score >= 80.  
    The grade is C if 80 > score >= 70.  
    The grade is D if 70 > score >= 60.  
    The grade is F otherwise.  */
import java.util.Scanner;

public class Chapter3_Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Create array for exactly 5 scores
        int[] scores = new int[5];
        System.out.print("Enter scores: ");
        // Read 5 scores into the array
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        
        // Assign grade for each score
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            // Display results
            System.out.println("Score is " + score + " and Grade is " + grade);
        }
        // close scanner
        input.close();
    }
}
