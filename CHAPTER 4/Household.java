// Household.java
// Chapter 4, Exercise 3
// Additional constructors from exercises 3b and 3c
// are commented below

public class Household
{
   int occupants;
   double annualIncome;

   // constructor added for Exercise 3c
   public Household(int occ, double inc)
   {
      occupants = occ;
      annualIncome = inc;
   }

   // constructor added for Exercise 3b
   public Household(int occ)
   {
      occupants = occ;
      annualIncome = 0.0;
   }
   // constructor for Exercise 3a
   public Household()
   {
      occupants = 1;
      annualIncome = 0.0;
   }

   public int getOccupants()
   {
      return occupants;
   }

   public void setOccupants(int occ)
   {
      occupants = occ;
   }

   public double getAnnualIncome()
   {
      return annualIncome;
   }

   public void setAnnualIncome(double inc)
   {
      annualIncome = inc;
   }

}