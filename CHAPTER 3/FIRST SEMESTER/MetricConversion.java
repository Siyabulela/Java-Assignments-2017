/*There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
Create a class named MetricConversion. Its main() method accepts an integer value
from a user at the keyboard, and in turn passes the entered value to two methods.
One converts the value from inches to centimeters and the other converts the same
value from gallons to liters. Each method displays the results with appropriate
explanation. Save the application as MetricConversion.java.*/

import java.util.Scanner;
public class MetricConversion
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      double num;
      
      System.out.println("Enter a number");
      num = kb.nextDouble();
      
      MetricConvert(num);
      MetricConverts(num);
   }
   public static void MetricConvert(double n)
   {
      double meter = 2.54;
      double sum;
      
      sum = n * meter;
      System.out.println("There are " + sum + " centimeters in " + n + " inch(es)");
   }
   public static void MetricConverts(double n)
   {
      double litre = 3.7854;
      double sum;
      sum = n * litre;
      System.out.println("There are " + sum + " litres in " + n + " gallon");
   }
}