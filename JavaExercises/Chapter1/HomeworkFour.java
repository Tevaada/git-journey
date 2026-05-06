import java.util.Scanner;

class HomeworkFour
{
    public static void main(String[] args)
    {   // Create an object of scanner to read input from the user
        Scanner userdata = new Scanner(System.in);

        // Create Variabnle 
        int computerNum = 50;
        int Guess;
        int trackCount = 0;

        // ask user to Guess the correct number
        System.out.print("Guess the number: ");
        Guess = userdata.nextInt(); // Take float input from the user
        trackCount++;    

            // use while loop to make to check the guessed 
            while( Guess != computerNum)
            {
                if (Guess < computerNum){
                    System.out.print("Too low!!"); // display too low if under 50
            
                }else{
                    System.out.print("Too High!!"); // display too high if above 50
                }

                System.out.print("Try againt!: "); // display try again if the guesses is wrong 

                Guess = userdata.nextInt();  // Take float input from the user
                trackCount++;    
            }
            
            //display the success guesed and the number of attemps
            System.out.println("Well done you took "+ trackCount + " attemps!");
            
            // Close the Scanner object
            userdata.close();
    }
}