/*Add a prompt to the CondoSales application to ask the user to specify a (1) garage
or a (2) parking space, but only if the condo view selection is valid. Add $5,000 to
the price of any condo with a garage. If the parking value is invalid, display an
appropriate message and assume that the price is for a condo with no garage. Save
the file as CondoSales2.java.*/

import java.util.Scanner;
public class CondoSales2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      int choose;
      int garage;
      int park = 150000;
      int golf = 170000;
      int lake = 210000;
      int gara = 5000;
      int invalid = 0;
      
      System.out.println("MENU");
      System.out.println("1 >> PARK VIEW");
      System.out.println("2 >> GOLF COURSE VIEW");
      System.out.println("3 >> LAKE VIEW");
      System.out.println("Please select the condominuim view you want>>");
      choose = kb.nextInt();
      System.out.println("Enter 1 for a Parking Spcae, or 2 for a Garage>>");
      garage = kb.nextInt();
   
      if(garage == 1){
         if(choose == 1){
            System.out.println("Park view condos are $" + park);
         }
         else if(choose == 2){
            System.out.println("Condos with golf course views are $" + golf);
         }
         else if(choose == 3){
            System.out.println("Condos with lake views are $" + lake);
         }
      }
      else if(garage == 2){
         if(choose == 1){
            System.out.println("Park view condos are $" + (park + gara));
         }
         else if(choose == 2){
            System.out.println("Condos with golf course views are $" + (golf + gara));
         }
         else if(choose == 3){
            System.out.println("Condos with lake views are $" + (lake + gara));
         }
         
      }
      else
         System.out.println("$" + invalid);
   }
}