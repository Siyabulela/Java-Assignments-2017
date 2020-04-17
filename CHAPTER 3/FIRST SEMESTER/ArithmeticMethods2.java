/*Modify the ArithmeticMethods class to accept the values of the two integers from
a user at the keyboard. Save the file as ArithmeticMethods2.java.*/

import java.util.Scanner;
public class ArithmeticMethods2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int num1, num2;
      
      System.out.println("Enter 1st number");
      num1 = kb.nextInt();
      System.out.println("Enter 2nd number");
      num2 = kb.nextInt();
      
      displayNumberPlus10(num1);
      displayNumberPlus10(num2);
      displayNumberPlus100(num1);
      displayNumberPlus100(num2);
      displayNumberPlus1000(num1);
      displayNumberPlus1000(num2);
   }
   public static void displayNumberPlus10(int n)
   {
      int sum = 0;
      sum = n + 10;
      System.out.println(n + " + 10 = " + sum);
   }
   public static void displayNumberPlus100(int n)
   {
      int sum = 0;
      sum = n + 100;
      System.out.println(n + " + 100 = " + sum);
   }
   public static void displayNumberPlus1000(int n)
   {
      int sum = 0;
      sum = n + 1000;
      System.out.println(n + " + 1000 = " + sum);
   }
}