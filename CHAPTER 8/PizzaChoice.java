/*Write an application that prompts the user to make a choice for a pizza size—S, M, L,
or X—and then displays the price as $6.99, $8.99, $12.50, or $15.00, accordingly.
Display an error message if the user enters an invalid pizza size. Save the file as
PizzaChoice.java.*/
import java.util.Scanner;
public class PizzaChoice
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      double []price = {6.99, 8.99, 12.50, 15.00};
      char size;
      
      System.out.println("make a choice for a pizza size. S, M, L, or X");
      size = kb.next().charAt(0);
      
      if(size == 'S' || size == 's')
         System.out.println("$" + price[0]);
      else
         if(size == 'M' || size == 'm')
            System.out.println("$" + price[1]);
         else
            if(size == 'L' || size == 'l')
               System.out.println("$" + price[2]);
            else
               if(size == 'X' || size == 'x')
                  System.out.println("$" + price[3]);
               else
                  System.out.println("Incorrect choice");
   }
}