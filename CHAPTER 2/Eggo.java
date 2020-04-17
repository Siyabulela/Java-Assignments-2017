/*Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
Write a class that prompts a user for the number of eggs in the order and then
display the amount owed with a full explanation. For example, typical output might
be, “You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45.0
cents each for a total of $7.85.” Save the class as Eggs.java.*/

import java.util.Scanner;
public class Eggo
{
   public static void main(String[]args)
   {  
      int order;
      int dozen2;
      int looseEgg;
      int dozen = 12;
      double dozenCost = 3.25;
      double looseCost = 0.45;
      double totCost;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter eggs bought");
      order = inputDevice.nextInt();
      dozen2 = order / dozen;
      looseEgg = order - dozen * 2;
      totCost = (looseEgg * looseCost) + (dozen2 * dozenCost);
      System.out.println("You ordered "+ order+ " eggs. That's " + dozen2 + " dozen at $" +dozenCost+ " per dozen and "+ looseEgg + " loose eggs at $"+ looseCost);
      System.out.println("cent each for a total of $"+ totCost + "."); 
   }
}
      