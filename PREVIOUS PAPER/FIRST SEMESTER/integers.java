/*Write a Java program that will allow the user to enter a series 
of integers via the keyboard. The first integer is special, as 
it indicates how many more integers will follow. Your program is to 
calculate the sum and average of theintegers, excluding the first 
integer, and display these values to the screen.*/
import java.util.Scanner;
public class integers
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double num, num2, sum  = 0, average = 0;
      
      System.out.println("Enter an integer");
      num = kb.nextDouble();
      
      for(int i = 1; i <= num; i++)
      {
         System.out.println("Enter an integer " + i);
         num2 = kb.nextDouble();
         sum = sum + num2;
      }
      average = sum / num;
      System.out.println("Sum    : " + sum);
      System.out.println("Average: " + average);
   }
}