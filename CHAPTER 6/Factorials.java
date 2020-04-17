/*Write an application that displays the factorial for every integer value from 1 to 10. A
factorial of a number is the product of that number multiplied by each positive integer
lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. Save the file as Factorials.java.*/

public class Factorials
{
   public static void main(String[]args)
   {
      int factorial = 1;
      
      for(int n = 1; n <= 10; n++)
      {
         factorial = factorial * n;
         System.out.println("The factorial of number " + n + " is " + factorial);
         
      }
   }
}