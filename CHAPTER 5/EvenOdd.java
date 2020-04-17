//Write an application that asks a user to enter an integer. Display a statement that
//indicates whether the integer is even or odd. Save the file as EvenOdd.java.

import java.util.Scanner;
public class EvenOdd
{
   public static void main (String [] args)
   {
      int integer_1;
      Scanner inputDevice = new Scanner (System.in);
      System.out.println("Enter Integer");
      integer_1 = inputDevice.nextInt();
      if (integer_1 % 2 == 0)
         System.out.println("The integer is a even number ");
      else
         System.out.println("The integer is a odd number ");
   }
}



  
