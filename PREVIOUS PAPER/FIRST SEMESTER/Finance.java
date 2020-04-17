import java.util.Scanner;
public class Finance
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      double principle, year, rate, total;
      
      System.out.println("Enter principle");
      principle = kb.nextDouble();
      System.out.println("Enter period");
      year = kb.nextDouble();
      System.out.println("Enter rate in decimals");
      rate = kb.nextDouble(); 
      
      total = principle * Math.pow((1 + rate),year);
      
      System.out.println(total);
   }
}