public class HomeworkFive
{
    public static void main(String[] args)
    {
        // create variable
        int n = 0;
        
        // using for loop to find the even integer that less than 10000
        for (int i = 2; i * i * i < 10000; i += 2) {
            n = i;
        }
        // display the solution even n^3 that less than 10000
        System.out.println("Largest Even integer n^3 that < 10000 is: " + n);
        
    }
}
