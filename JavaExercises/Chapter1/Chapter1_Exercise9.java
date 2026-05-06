/*  Write a program that calculates the following series: 
    1 / (√1 + √2) + 1 / (√2 + √3) + ... + 1 / (√624 + √625) */

public class Chapter1_Exercise9 {
    public static void main(String[] args){
    int numerator = 1;   // The numerator is always 1
    float sum = 0;      // Variable to store the total sum of the series

    // Loop from k = 1 to k = 624
    for (int k = 1; k <= 624; k++){
        double denominator = Math.sqrt(k) + Math.sqrt(k + 1);   // Calculate the denominator
        sum += numerator  /  denominator;          // // Calculate the total sum
    }
     // Display the final result
    System.out.printf("Solution of the series is: %.2f", sum);
    }
}

