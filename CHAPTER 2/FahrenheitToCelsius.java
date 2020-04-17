/* Write a program that accepts a temperature in Fahrenheit from a user and converts 
it to Celsius by subtracting 32 from the Fahrenheit value and multiplying the result 
by 5/9. Display both values. Save the class as FahrenheitToCelsius.java. */

import java.util.Scanner;
public class FahrenheitToCelsius
{
   public static void main (String[]args)
   {
      int Fahr;
      int Cels;
      int XFahr;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter temperature in Fahrenheit>>");
      Fahr = inputDevice.nextInt();
      XFahr = (Fahr - 32) * 5/9;
      System.out.println("Temperature is "+ XFahr + " °C");
   }
}
      
