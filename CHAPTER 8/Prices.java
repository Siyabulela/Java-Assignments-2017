/*Create an application containing an array that stores 20 prices, such as $2.34, $7.89,
$1.34, and so on. The application should (1) display the sum of all the prices, (2)
display all values less than $5.00, (3) calculate the average of the prices, and (4) display
all values that are higher than the calculated average value. Save the file as Prices.java.*/
import java.util.Scanner;
public class Prices
{
   public static void main(String[]args)
   {
      double []price = new double[20];
      double sum = 0, average;
      
      inputPrice(price);
      sum = calculateSum(price);
      displayLessThan5(price);
      average = calculateAve(sum);
      displayMoreThanAve(price, average);
      
   }
   public static void inputPrice(double []price)
   {
      Scanner kb = new Scanner(System.in);
      int x;
      
      for(x = 0; x < price.length; x++)
      {
         System.out.println("Enter price " + (x + 1));
         price[x] = kb.nextDouble();
      }
   }
   public static double calculateSum (double []price)
   {
      double sum = 0;
      for(int x = 0; x < price.length; x++)
      {
         sum = sum + price[x];
      }
      System.out.println("Sum is " + sum);
      return sum;
   }
   public static void displayLessThan5(double []price)
   {
      for(int x = 0; x < price.length; x++)
      {
         if(price[x] < 5)
         {
            System.out.println(price[x] + " is less than 5");
         }
      }
   }
   public static double calculateAve(double sum)
   {
      double average = sum / 20;
      return average;
   }
   public static void displayMoreThanAve(double []price, double average)
   {
      for(int x = 0; x < price.length; x++)
      {
         if(price[x] > average)
         {
            System.out.println(price[x] + " is more than the average");
         }
      }
   }
}