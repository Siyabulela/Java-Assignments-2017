/*Create a class named Pizza. Data fields include a String for toppings (such as
“pepperoni”), an integer for diameter in inches (such as 12), and a double for
price (such as 13.99). Include methods to get and set values for each of these
fields. Save the class as Pizza.java.*/
public class Pizza
{
   private String toppings;
   private int diameter = 16;
   private double price = 89.99;  
   
   public void setToppings(String toppings)
   {
      this.toppings = toppings;
   }
   public void setDiameter(int diameter)
   {
      this.diameter = diameter;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   public String getToppings()
   {
      return toppings;
   }
   public int getDiameter()
   {
      return diameter;
   }
   public double getPrice()
   {
      return price;
   }
}