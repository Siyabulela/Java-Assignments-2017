/*Create an application named TestPizza that instantiates one Pizza object and
demonstrates the use of the Pizza set and get methods. Save this application as
TestPizza.java.*/
public class TestPizza
{
   public static void main(String[]args)
   {
      Pizza guest = new Pizza();
      
      guest.setToppings("Chicken & Mashrooms");
      guest.setDiameter(24);
      guest.setPrice(600);
   
      System.out.println("Toppings : " + guest.getToppings());
      System.out.println("Diameter : " + guest.getDiameter());
      System.out.println("Price    : R" + guest.getPrice());
   }
}