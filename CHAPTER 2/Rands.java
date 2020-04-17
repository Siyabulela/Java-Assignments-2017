/*Write a class that calculates and displays the conversion of an entered number of Rands 
into currency denominations—20s, 10s, 5s, and 1s. Save the class as Rands.java. */
import java.util.Scanner;
public class Rands
{
   public static void main(String[]args)
   {
      int Amount;
      int Twenty2;
      int Twenty = 20;
      int Ten2;
      int Ten = 10;
      int Five2;
      int Five = 5;
      int One2;
      int One = 1;
      
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter your amount");
      Amount = kb.nextInt();
      Twenty2 = Amount / Twenty;
      Ten2 = Amount / Ten;
      Five2 = Amount / Five;
      One2 = Amount / One;
      System.out.println("There are " + Twenty2 + " 20s in " + Amount);
      System.out.println("There are " + Ten2 + " 10s in " + Amount);
      System.out.println("There are " + Five2 + " 5s in " + Amount);
      System.out.println("There are " + One2 + " 1s in " + Amount);
   }
}