/*  Write a program that displays 10 numbers per line from 50 to 150 that
    are divisible by 3 or 5 but not both.The numbers must be left-aligned */

    public class Chapter1_Exercise7 {
    public static void main(String[] args){
    int count = 0;  // Create variable 
        
        // Loop through numbers from 50 to 150
        for(int i = 50; i <= 150 ; i++){
        
            if((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)){     // Check the number 
            System.out.printf("%-6d" , i);   // Print the number left-aligned
            count++;
            
                if(count % 10 == 0){  // Move to a new line 
                System.out.println();
                }
            }
        }
    }
}
