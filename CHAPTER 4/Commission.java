// Commission.java
// Creates a class for computing commission

public class Commission
{
   public static void main(String[] args)
   {
      double sales = 50000.0;
      double commission = 0.0;
      double doubRate = .05;
      int intRate = 5;
      commission = computeCommission(sales, doubRate);

      System.out.println("Commission on sales of " +
           sales + " with a rate of " + doubRate +
           " (which is " + (doubRate*100) + "%) is " +
           commission);
        
      commission = computeCommission(sales, intRate);

      System.out.println("Commission on sales of " +
           sales + " with a rate of " + intRate + "%" +
           " is " + commission);
   }

   public static double computeCommission(double s, double r)
   {
      return (r  * s);
   }

   public static double computeCommission(double s, int r)
   {
      return (r / 100.0  * s);
   }

}