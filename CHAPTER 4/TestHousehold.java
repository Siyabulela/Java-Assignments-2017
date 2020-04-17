// TestHousehold.java
// Chapter 4, Exercise 3

public class TestHousehold
{

   public static void main(String[] args)
   {
      Household house = new Household();
   
      System.out.println("The house before using the set methods has " +
         house.getOccupants() +
         " occupants and an income of " + house.getAnnualIncome());
   
      house.setAnnualIncome(55000);
      house.setOccupants(3);
      System.out.println("The revised house has " +
         house.getOccupants() +
         " occupants and an income of " + house.getAnnualIncome());
   
   
      // code to test constructor added for exercise 3a
   
      Household house2 = new Household(2);
      System.out.println("The second house has " +
         house2.getOccupants() + " occupants and an income of " +
         house2.getAnnualIncome());
   
     // code to test constructor added for exercise 3b
   
      Household house3 = new Household(7,80000.0);
   
      System.out.println("The third house has " +
         house3.getOccupants() + " occupants and an income of " +
         house3.getAnnualIncome());
   }
}