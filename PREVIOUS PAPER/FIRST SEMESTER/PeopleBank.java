//S.M KHUMALO
//21617908
import java.util.Scanner;
public class PeopleBank
{
   public static void main(String[]args)
   {
      String name;
      double amount, rate, value;
      int period, display;
      
      name = inputName();
      amount = inputInvestmentAmount();
      period = inputInvestmentPeriod();
      rate = inputInterestRate();
      value = calculateMaturityValue(amount, period, rate);
      displayInvestment(name, amount, period, value);
   }
   public static String inputName()
   {
      Scanner kb = new Scanner(System.in);
      String name;
      System.out.print("Enter the client's full name>> ");
      name = kb.nextLine();
      return name;
   }
   public static double inputInvestmentAmount()
   {
      Scanner kb = new Scanner(System.in);
      double amount;
      System.out.print("Enter the amount to invest>> ");
      amount = kb.nextDouble();
      return amount;
   }
   public static int inputInvestmentPeriod()
   {
      Scanner kb = new Scanner(System.in);
      char period2;
      String period3;
      int period = 0;
      
      System.out.println("Enter the period to invest:");
      System.out.println("Short term of 1 year, enter S");
      System.out.println("Medium term of 5 year, enter M");
      System.out.print("Long term of 10 year, enter L >> ");
      period2 = kb.next().charAt(0);
      period3 = kb.nextLine();
      
      if(period2 == 'S' || period2 == 's' || period3.equalsIgnoreCase("small"))
         period = 1;
      else
         if(period2 == 'M' || period2 == 'm' || period3.equalsIgnoreCase("medium"))
            period = 5;
         else
            if(period2 == 'L' || period2 == 'l' || period3.equalsIgnoreCase("large"))
               period = 10;
      return period;
   }
   public static double inputInterestRate()
   {
      Scanner kb = new Scanner(System.in);
      double rate;
      System.out.println("Enter the interest rate as a decimal>>");
      rate = kb.nextDouble();
      return rate;
   }
   public static double calculateMaturityValue(double amount, int period, double rate)
   {
      double value = amount * Math.pow((1 + rate),period);
      return value;
   }
   public static void displayInvestment(String name, double amount, int period, double value)
   {
      System.out.println("------------------------------------------------");
      System.out.println("Name of client            : " + name);
      System.out.println("Investment Amount         : R" + amount);
      System.out.println("Period of investment      : " + period + " year(s)");
      System.out.println("Investment Maturity value : R" + value);
   }
}