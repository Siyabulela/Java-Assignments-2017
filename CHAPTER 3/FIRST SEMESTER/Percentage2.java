/*Modify the Percentages class to accept the values of the two doubles from a user
at the keyboard. Save the file as Percentages2.java.*/

import java.util.Scanner;
public class Percentage2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      double x;
      double y;
      
      System.out.println("Enter 1st number");
      x = kb.nextDouble();
      System.out.println("Enter 2nd number");
      y = kb.nextDouble();
      
      computePercent(x , y);
      computePercent(y , x);
   }
   public static void computePercent(double xx, double yy)
   {
      double p = 0;
      p = xx / yy * 100;
      System.out.println(xx + " is " + p + "% of " + yy);
   }
}