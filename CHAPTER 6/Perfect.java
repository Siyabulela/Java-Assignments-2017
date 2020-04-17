/*Write an application that displays every perfect number from 1 through 1,000. A
perfect number is one that equals the sum of all the numbers that divide evenly into it.
For example, 6 is perfect because 1, 2, and 3 divide evenly into it, and their sum is 6;
however, 12 is not a perfect number because 1, 2, 3, 4, and 6 divide evenly into it, and
their sum is greater than 12. Save the file as Perfect.java.*/
//import java.util.Scanner;
public class Perfect
{
   public static void main(String[]args)
   {
      int sum = 0;
      
      for(int n = 1; n <= 10000; n++)
      {
         for(int x = 1; x <= n/2; x++)
         {
            if(n % x == 0){
               sum = sum + x;
            }
         }
         if(n == sum){
            System.out.println(n + " is a PERFECT NUMBER");
         }
         else
            System.out.println(n + " is not a PERFECT NUMBER");
         sum = 0;
      }
   }
}