import java.util.Scanner;
public class ProjectedSales
{
   public static void main(String[]args)
   {
      double northSales;
      double southSales;
      double percentage = 0.10;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter this year's North sales");
      northSales = inputDevice.nextDouble();
      northSales = (northSales * percentage) + northSales;
      System.out.println("Please enter this year's South sales");
      southSales = inputDevice.nextDouble();
      southSales = (southSales * percentage) + southSales;
      System.out.println("North sales will increase to R"+ northSales + " next year");
      System.out.println("South sales will increase to R"+ southSales + " next year");
   }
}