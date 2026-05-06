public class HomeworkFives
{
    public static void main(String[] args) 
    {
        int number = 0;

        // Find the largest even integer i such that i^3 < 10000
        for (int i = 2; i * i * i < 10000; i += 2) 
        {
            number = i;  // Update number as long as the cube is under 10000
        }
        
        // Display result with cube value 
        System.out.println("Largest even integer n where n^3 < 10000:");
        System.out.println("n = " + number);
        System.out.println("n^3 = " + (number * number * number));  // 8000
        System.out.println("Next even (22)^3 = " + (22 * 22 * 22) + " → too big");
    
    }
}
