// Pay.java
// Chapter 4,  Exercise 2

public class Pay
{

   public static void main(String[] args)
   {
      double workHours = 40.0;
      double hourlyRate = 5.65;
      double withholdingRate = .15;
      double grossPay;
      double netPay;
      netPay = computeNetPay(workHours, hourlyRate, withholdingRate);
      System.out.println("Net pay for " + workHours +
         " hours is "+ netPay);
   
      netPay = computeNetPay(workHours, hourlyRate);
      System.out.println("Net pay for " + workHours +
         " hours is "+ netPay);
   
      netPay = computeNetPay(workHours);
      System.out.println("Net pay for " + workHours +
         " hours is "+ netPay);
   }

   public static double computeNetPay(double hrs, double rate,
      double wr)
   {
      double gross = hrs * rate;
      double net = gross - (gross * wr);
      return net;
   }

   public static double computeNetPay(double hrs, double rate)
   {
      final double RATE = 0.15;
      double gross = hrs * rate;
      double net = gross - (gross * RATE);
      return net;
   }

   public static double computeNetPay(double hrs)
   {
      final double MIN = 5.85;
      final double RATE = 0.15;
      double gross = hrs * MIN;
      double net = gross - (gross * RATE);
      return net;
   }
}