/*Write a class that calculates and displays the conversion of an entered number of dollars 
into currency denominations—20s, 10s, 5s, and 1s. Save the class as Dollars.java. */
import java.util.Scanner;
public class Dollars
{
   public static void main(String[]args)
   {
      double Dollar;
      double Rands = 14.95;
      double X;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter your Dollars");
      Dollar = inputDevice.nextDouble();
      X = Dollar * Rands;
      System.out.println("Your money in Dollars($) is "+Dollar + " \nYour money in Rands(R) is "+ X);
   }
}

      