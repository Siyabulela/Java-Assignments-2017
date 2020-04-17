/*Write a Java program that will prompt for, receive and total a
collection of payroll amounts entered at the terminal/keyboard until a sentinel
amount of 999 is entered. After the sentinel has been entered, display
the total payroll amount, as well as the number of  employees on the payroll.*/
import java.util.Scanner;
public class NineToStop
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double answer = 0, sum = 0;
      
      while(answer != 999)
      {
         sum = sum + answer;
         
         System.out.println("Enter payroll amount or 999 to Stop");
         answer = kb.nextDouble();
      }
      System.out.println(sum);
   }
}