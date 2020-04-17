/*Prompt the user to choose an item using the number (1, 2, or 3) that corresponds to
the item, or to enter 0 to quit the application. After the user makes the first selection,
if the choice is 0, display a total bill of $0. Otherwise, display the menu again. The user
should respond to this prompt with another item number to order or 0 to quit. If the
user types 0, display the cost of the single requested item. If the user types 1, 2, or 3,
add the cost of the second item to the first, and then display the menu a third time. If
the user types 0 to quit, display the total cost of the two items; otherwise, display the
total for all three selections. Save the file as Coffee.java.*/

import java.util.Scanner;
public class Coffee
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int flav;
      double amer = 1.99;
      double espr = 2.50;
      double latt = 2.15;
      
      System.out.println("MENU");
      System.out.println("1 >> AMERICAN"); 
      System.out.println("2 >> ESPRESSO");
      System.out.println("3 >> LATTE");
      System.out.println("Enter your Coffee Flavour");
      flav = kb.nextInt();
     
      if(flav == 1){
         System.out.println("AMERICAN cost $" + amer);
      }
      else if(flav == 2){
         System.out.println("ESPRESSO cost $" + espr);
      }
      else if(flav == 3){
         System.out.println("LATTE cost $" + latt);
      }
      else if(flav == 0){
         System.out.println("$0");
      }
   }
}