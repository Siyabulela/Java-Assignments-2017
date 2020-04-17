import java.util.Scanner;
public class IfStatementInMethods
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double num1, num2, num3, sum;
      
      System.out.println("Enter num1");
      num1 = kb.nextDouble();
      System.out.println("Enter num2");
      num2 = kb.nextDouble();
      System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, or 4 to divide");
      num3 = kb.nextDouble();
      
      if(num3 == 1)
      {
         sum = SumNumbers(num1, num2);
         System.out.println(num1 + " + " + num2 + " = " + sum);
      }
      if(num3 == 2)
      {
         sum = DifferentNumbers(num1, num2);
         System.out.println(num1 + " - " + num2 + " = " + sum);
      }
      if(num3 == 3)
      {
         sum = MultiplyNumbers(num1, num2);
         System.out.println(num1 + " * " + num2 + " = " + sum);
      }
      if(num3 == 4)
      {
         sum = DivideNumbers(num1, num2);
         System.out.println(num1 + " / " + num2 + " = " + sum);
      }
   }
   public static double SumNumbers( double num1, double num2)
   {
      double sum = num1 + num2;
      return sum;
   }
   public static double DifferentNumbers( double num1, double num2)
   {
      double sum = num1 - num2;
      return sum;
   }
   public static double MultiplyNumbers( double num1, double num2)
   {
      double sum = num1 * num2;
      return sum;
   }
   public static double DivideNumbers( double num1, double num2)
   {
      double sum = num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + sum);
      return sum;
   }
}