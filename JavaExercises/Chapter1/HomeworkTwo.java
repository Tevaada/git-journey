import java.util.Scanner;

    public class HomeworkTwo
{
    public static void main(String[] args)
    {
        // Create an object of scanner to read input from the user
        Scanner userdata = new Scanner(System.in);
        float number;        // use variable float if the user want to input decimal number
        
        // Use Do while loop to keep asking until the user input number over 5
        do{
            // Display float input message from the user
            System.out.printf("Please enter a number: "); 
            number = userdata.nextFloat();        // Take float input from the user         
        
        }while(number <=5);

        // Display the last message
        System.out.printf("The last number you entered was " + number + " ,number over 5");
        
        // Close the Scanner objects
        userdata.close();
    } 
}