/*  Write a program to finds four perfect numbers
    that are less than 10000. */

public class Chapter1_Exercise10 {
    public static void main(String[] args) {
        int limit = 10000;  
        System.out.println("Perfect numbers less than 10000:"); 
        
        for (int number = 1; number < limit; number++) {  // Loop through all numbers from 1 to 9999
            int sum = 0;
            // Find all proper divisors of 'number'
            for (int divisor = 1; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {   // Check if 'divisor' is a proper divisor
                    sum += divisor;             // Add the divisor to the sum
                }
            }
            // Check if the number is perfect
            if (sum == number) {
                System.out.println(number);  // Print the perfect number
            }
        }
    }
}

