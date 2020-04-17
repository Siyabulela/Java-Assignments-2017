/*Write an application that shows the sum of 1 to n for every n from 1 to 50. That is, the
program displays 1 (the sum of 1 alone), 3 (the sum of 1 and 2), 6 (the sum of 1, 2,
and 3), 10 (the sum of 1, 2, 3, and 4), and so on. Save the file as EverySum.java.*/

public class EverySum
{
   public static void main(String[]args)
   {
      int sum = 0;
      
      for(int x = 1; x <= 50; x++){
         for(int y = 0; y < x; y++)
            sum += 1 + y;
         System.out.println("Sum between 1 and " + x + " = " + sum);
         sum = 0;
      }
   }
}