import java.util.Scanner;
public class SheRob
{
   public static void main(String[]args)
   {
      double num1;
      double num2;
      double perc;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter num1");
      num1 = inputDevice.nextInt();
      System.out.println("Enter num2");
      num2 = inputDevice.nextInt();
      perc = (num1 / num2) * 100;
      System.out.println(perc+"%");
   }
}