/*Create an application named Percentages whose main() method holds two double
variables. Assign values to the variables. Pass both variables to a method named
computePercent() that displays the two values and the value of the first number as a
percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method
should display a statement similar to “2.0 is 40% of 5.0.” Then call themethod a second
time, passing the values in reverse order. Save the application as Percentages.java.*/

public class Percentage
{
   public static void main(String[]args)
   {
      double x = 2.0;
      double y = 5.0;
      
      computePercent(x , y);
      computePercent(y , x);
   }
   public static void computePercent(double xx, double yy)
   {
      double p = 0;
      p = xx / yy * 100;
      System.out.println(xx + " is " + p + "% of " + yy);
   }
}