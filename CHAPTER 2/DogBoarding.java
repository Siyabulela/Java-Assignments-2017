/*The Happy Yappy Kennel boards dogs at a cost of 50 cents per pound per day. 
Write a class that accepts a dog’s weight and number of days to be boarded 
and displays the total price for boarding. Save the class as DogBoarding.java.*/

import java.util.Scanner;
public class DogBoarding
{
   public static void main(String[]args)
   {  
      int pound;
      double poundCost = 0.50;
      int days;
      double X;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter dog's pound >>");
      pound = inputDevice.nextInt();
      System.out.println("Your dog's weight is " + pound+ ". Please enter days >>");
      days = inputDevice.nextInt();
      System.out.println("Your dog will be boarded for " + days + " days");
      X = (pound * poundCost) * days;
      System.out.println("The total price for boarding is R" + X);
   }
} 
   
 