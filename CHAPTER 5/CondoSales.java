/*Write an application for the Summerdale Condo Sales office; the program
determines the price of a condominium. Ask the user to choose 1 for park view,
2 for golf course view, or 3 for lake view. The output is the name of the chosen
view as well as the price of the condo. Park view condos are $150,000, condos with
golf course views are $170,000, and condos with lake views are $210,000. If the
user enters an invalid code, set the price to 0. Save the file as CondoSales.java.*/

import java.util.Scanner;
public class CondoSales
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      int choose;
      
      System.out.println("MENU");
      System.out.println("1 >> PARK VIEW");
      System.out.println("2 >> GOLF COURSE VIEW");
      System.out.println("3 >> LAKE VIEW");
      System.out.println("Please select the condominuim view you want>>");
      choose = kb.nextInt();
      
      if(choose == 1){
         System.out.println("Park view condos are $150,000");
      }
      else if(choose == 2){
         System.out.println("Condos with golf course views are $170,000");
      }
      else if(choose == 3){
         System.out.println("Condos with lake views are $210,000");
      }
   }
}
