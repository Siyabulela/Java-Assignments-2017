/*Modify the CountByFives application so that the user enters the value to count
by. Start each new line after 10 values have been displayed. Save the file as
CountByAnything.java.*/

import java.util.Scanner;
public class CountByAnything
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      int X;
      String Y = "; ";
      
      System.out.println("Enter any value");
      X = kb.nextInt();
      
      while(X <= 200){
         System.out.print(X + Y);
         if(X % 50 == 0){
            System.out.print("\n");
         }
         X += X ;
      }
   }
}