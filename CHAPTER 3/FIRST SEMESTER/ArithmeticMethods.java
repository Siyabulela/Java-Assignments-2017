public class ArithmeticMethods
{
   public static void main(String[]args)
   {
      int num1 = 10, num2 = 20;
      
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